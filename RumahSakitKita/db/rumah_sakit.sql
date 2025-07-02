-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Jul 2025 pada 07.55
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumah_sakit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_resep`
--

CREATE TABLE `detail_resep` (
  `kd_detail` varchar(20) NOT NULL,
  `kd_resep` varchar(20) DEFAULT NULL,
  `kd_obat` varchar(20) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `aturan_pakai` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `detail_resep`
--

INSERT INTO `detail_resep` (`kd_detail`, `kd_resep`, `kd_obat`, `jumlah`, `aturan_pakai`) VALUES
('DTR0001', 'RCP0001', 'OBT0001', 1, '3x1 sehari'),
('DTR0002', 'RCP0001', 'OBT0001', 21, 'ress'),
('DTR0003', 'RCP0001', 'OBT0002', 1, '1x1 sehari'),
('DTR0004', 'RCP0001', 'OBT0001', 12, '1x1'),
('DTR0005', 'RCP0002', 'OBT0001', 8, '1x1');

--
-- Trigger `detail_resep`
--
DELIMITER $$
CREATE TRIGGER `adjust_stock_on_update` AFTER UPDATE ON `detail_resep` FOR EACH ROW BEGIN
    -- If medicine changed
    IF NEW.kd_obat != OLD.kd_obat THEN
        -- Restore old medicine stock
        UPDATE obat SET stok = stok + OLD.jumlah WHERE kd_obat = OLD.kd_obat;
        -- Reduce new medicine stock
        UPDATE obat SET stok = stok - NEW.jumlah WHERE kd_obat = NEW.kd_obat;
    ELSE
        -- Adjust stock by quantity difference
        UPDATE obat 
        SET stok = stok + (OLD.jumlah - NEW.jumlah)
        WHERE kd_obat = NEW.kd_obat;
    END IF;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `reduce_stock_on_insert` AFTER INSERT ON `detail_resep` FOR EACH ROW BEGIN
    UPDATE obat 
    SET stok = stok - NEW.jumlah 
    WHERE kd_obat = NEW.kd_obat;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `restore_stock_on_delete` AFTER DELETE ON `detail_resep` FOR EACH ROW BEGIN
    UPDATE obat 
    SET stok = stok + OLD.jumlah 
    WHERE kd_obat = OLD.kd_obat;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Struktur dari tabel `jadwal_shift`
--

CREATE TABLE `jadwal_shift` (
  `kd_shift` varchar(20) NOT NULL,
  `kd_petugas` varchar(20) NOT NULL,
  `shift` enum('Pagi','Siang','Malam','Lembur') NOT NULL,
  `tanggal` date NOT NULL,
  `jam_masuk` time NOT NULL,
  `jam_keluar` time NOT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `jadwal_shift`
--

INSERT INTO `jadwal_shift` (`kd_shift`, `kd_petugas`, `shift`, `tanggal`, `jam_masuk`, `jam_keluar`, `keterangan`) VALUES
('SFT0001', 'PTG0004', 'Pagi', '2025-06-01', '06:00:00', '12:00:00', 'masuk pagi'),
('SFT0002', 'PTG0001', 'Pagi', '2025-06-02', '02:30:00', '03:30:00', 'dd'),
('SFT0003', 'PTG0004', 'Malam', '2025-07-01', '01:00:00', '04:30:00', 'ada'),
('SFT0004', 'PTG0005', 'Pagi', '2025-07-02', '00:00:00', '01:00:00', 'lembur');

-- --------------------------------------------------------

--
-- Struktur dari tabel `obat`
--

CREATE TABLE `obat` (
  `kd_obat` varchar(20) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jenis_obat` varchar(50) DEFAULT NULL,
  `stok` int(11) NOT NULL DEFAULT 0,
  `satuan` varchar(20) NOT NULL,
  `tanggal_expired` date NOT NULL,
  `produsen` varchar(100) DEFAULT NULL,
  `harga` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `obat`
--

INSERT INTO `obat` (`kd_obat`, `nama_obat`, `jenis_obat`, `stok`, `satuan`, `tanggal_expired`, `produsen`, `harga`) VALUES
('OBT0001', 'Paracetamol 500mg', 'Analgesik', 80, 'Tablet', '2025-06-17', 'Kimia Farma', 5000.00),
('OBT0002', 'tes', 'test', 12, 'tablet', '2025-06-30', 'tes', 12000.00);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pasien`
--

CREATE TABLE `pasien` (
  `kd_pasien` varchar(20) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nama_pasien` varchar(100) NOT NULL,
  `jenis_kelamin` enum('L','P') NOT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `alamat` text NOT NULL,
  `no_hp` varchar(20) NOT NULL,
  `golongan_darah` enum('A','B','AB','O') DEFAULT NULL,
  `tanggal_registrasi` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `pasien`
--

INSERT INTO `pasien` (`kd_pasien`, `nik`, `nama_pasien`, `jenis_kelamin`, `tanggal_lahir`, `alamat`, `no_hp`, `golongan_darah`, `tanggal_registrasi`) VALUES
('PSN0001', '362852409012', 'Kirman', 'L', '2025-06-11', 'tangerang', '6285645745', 'B', '2025-06-28 01:00:28'),
('PSN0002', '365345235325', 'Hilman', 'L', '2025-06-06', 'depok', '6285465564', 'AB', '2025-06-28 01:00:28'),
('PSN0003', '367867895678', 'Jaka', 'L', '2025-06-15', 'aaa', '628545645', 'B', '2025-06-28 01:13:56'),
('PSN0004', '3933243243243', 'fajar', 'L', '2020-06-01', 'jakarta', '083326626626626', 'AB', '2025-06-30 11:53:53'),
('PSN0005', '1221412412412', 'bayu', 'L', '2006-07-04', 'bogor', '0865465234354', 'O', '2025-07-01 11:39:25'),
('PSN0006', '233546457833', 'RAIS', 'L', '2010-07-02', 'MAKASSAR', '08776656565', 'B', '2025-07-01 11:43:26'),
('PSN0007', '346289345767', 'sandy', 'L', '2011-07-01', 'jakarta', '0836353525', 'A', '2025-07-01 12:37:54');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pembayaran`
--

CREATE TABLE `pembayaran` (
  `kd_pembayaran` varchar(20) NOT NULL,
  `no_registrasi` varchar(20) DEFAULT NULL,
  `tgl_pembayaran` date DEFAULT NULL,
  `jenis_pembayaran` enum('Tunai','Kartu Kredit','Debit','Asuransi') DEFAULT NULL,
  `biaya_obat` decimal(12,2) DEFAULT 0.00,
  `biaya_perawatan` decimal(12,2) DEFAULT 0.00,
  `total_biaya` decimal(12,2) DEFAULT 0.00,
  `status_pembayaran` enum('Lunas','Belum Lunas','Sebagian') DEFAULT NULL,
  `keterangan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `pembayaran`
--

INSERT INTO `pembayaran` (`kd_pembayaran`, `no_registrasi`, `tgl_pembayaran`, `jenis_pembayaran`, `biaya_obat`, `biaya_perawatan`, `total_biaya`, `status_pembayaran`, `keterangan`) VALUES
('PYM0001', 'RGS002', '2025-06-30', 'Kartu Kredit', 40000.00, 200000.00, 240000.00, 'Lunas', 'tes'),
('PYM0002', 'RGS001', '2025-06-30', 'Debit', 182000.00, 200000.00, 382000.00, 'Belum Lunas', 'j'),
('PYM0003', 'RGS004', '2025-07-01', 'Debit', 200000.00, 30000.00, 230000.00, 'Lunas', 'selesai'),
('PYM0004', 'RGS005', '2025-07-01', 'Tunai', 70000.00, 60000.00, 130000.00, 'Lunas', 'boleh pulang'),
('PYM0005', 'RGS001', '2025-07-01', 'Tunai', 150000.00, 150000.00, 300000.00, 'Lunas', 'pembayaran obat');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pendaftaran`
--

CREATE TABLE `pendaftaran` (
  `no_registrasi` varchar(20) NOT NULL,
  `kd_pasien` varchar(20) NOT NULL,
  `tgl_registrasi` datetime DEFAULT current_timestamp(),
  `kd_petugas` varchar(20) NOT NULL,
  `keluhan` text DEFAULT NULL,
  `diagnosa_awal` text DEFAULT NULL,
  `status` enum('Menunggu','Diperiksa','Rawat Inap','Pulang') DEFAULT 'Menunggu'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `pendaftaran`
--

INSERT INTO `pendaftaran` (`no_registrasi`, `kd_pasien`, `tgl_registrasi`, `kd_petugas`, `keluhan`, `diagnosa_awal`, `status`) VALUES
('RGS001', 'PSN0001', '2025-06-28 01:18:42', 'PTG0001', 'pusing', 'migrain', 'Menunggu'),
('RGS002', 'PSN0002', '2025-06-28 01:18:42', 'PTG0002', 'pusing', 'tekanan bola mata naik', 'Diperiksa'),
('RGS003', 'PSN0002', '2025-06-28 17:04:32', 'PTG0002', 'sakit perutt', 'gerdd', 'Menunggu'),
('RGS004', 'PSN0004', '2025-06-30 11:55:52', 'PTG0001', 'sakit kepala', 'pusing', 'Menunggu'),
('RGS005', 'PSN0005', '2025-07-01 11:40:08', 'PTG0002', 'sakit peyut', 'mah', 'Diperiksa'),
('RGS006', 'PSN0006', '2025-07-01 11:44:41', 'PTG0001', 'PUYENG', 'TUGAS BANYAK', 'Pulang'),
('RGS008', 'PSN0006', '2025-07-01 12:50:13', 'PTG0004', 'pusing', 'migran', 'Rawat Inap');

-- --------------------------------------------------------

--
-- Struktur dari tabel `petugas_medis`
--

CREATE TABLE `petugas_medis` (
  `kd_petugas` varchar(20) NOT NULL,
  `nik` varchar(20) NOT NULL,
  `nama_petugas` varchar(100) NOT NULL,
  `profesi` enum('Dokter','Perawat','Bidan','Apoteker') NOT NULL,
  `jenis_kelamin` enum('L','P') NOT NULL,
  `alamat` text DEFAULT NULL,
  `no_hp` varchar(20) DEFAULT NULL,
  `tanggal_lahir` date DEFAULT NULL,
  `status_akhir` enum('Aktif','Non-Aktif','Cuti','Keluar') DEFAULT 'Aktif'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `petugas_medis`
--

INSERT INTO `petugas_medis` (`kd_petugas`, `nik`, `nama_petugas`, `profesi`, `jenis_kelamin`, `alamat`, `no_hp`, `tanggal_lahir`, `status_akhir`) VALUES
('PTG0001', '362852409012', 'Hari', 'Dokter', 'L', 'Jl Limo Depok , Jawa Barat', '628123232', '2025-06-02', 'Aktif'),
('PTG0002', '36244132523213', 'Rizki', 'Dokter', 'L', 'JL Panjat Pinang, Jakarta Barat, DKI Jakarta', '62819384938', '2025-06-10', 'Cuti'),
('PTG0003', '36812732132', 'Riri', 'Apoteker', 'P', 'jakarta', '628143435422', '2025-06-23', 'Aktif'),
('PTG0004', '31343143', 'Rara', 'Dokter', 'P', 'bekasi', '628122434', '2025-06-17', 'Aktif'),
('PTG0005', '34252462', 'Rahman', 'Apoteker', 'L', 'jakarta', '62812443', '2025-06-26', 'Aktif');

-- --------------------------------------------------------

--
-- Struktur dari tabel `resep`
--

CREATE TABLE `resep` (
  `kd_resep` varchar(20) NOT NULL,
  `no_registrasi` varchar(20) DEFAULT NULL,
  `kd_petugas` varchar(20) DEFAULT NULL,
  `tgl_resep` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `resep`
--

INSERT INTO `resep` (`kd_resep`, `no_registrasi`, `kd_petugas`, `tgl_resep`) VALUES
('RCP0001', 'RGS001', 'PTG0003', '2025-06-30'),
('RCP0002', 'RGS002', 'PTG0003', '2025-06-23'),
('RCP0004', 'RGS005', 'PTG0003', '2025-07-01'),
('RCP0005', 'RGS006', 'PTG0003', '2025-07-01'),
('RCP0006', 'RGS006', 'PTG0005', '2025-07-01');

-- --------------------------------------------------------

--
-- Struktur dari tabel `ruangan`
--

CREATE TABLE `ruangan` (
  `kd_ruangan` varchar(20) NOT NULL,
  `nama_ruangan` varchar(100) NOT NULL,
  `jenis_ruangan` enum('ICU','VIP','Kelas 1','Kelas 2','Kelas 3') NOT NULL,
  `kapasitas` int(11) NOT NULL DEFAULT 1,
  `lantai` int(11) NOT NULL,
  `fasilitas` text DEFAULT NULL,
  `status` enum('Tersedia','Terisi','Perbaikan') DEFAULT 'Tersedia',
  `harga_per_hari` decimal(12,2) NOT NULL,
  `tanggal_pembaruan` datetime DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `ruangan`
--

INSERT INTO `ruangan` (`kd_ruangan`, `nama_ruangan`, `jenis_ruangan`, `kapasitas`, `lantai`, `fasilitas`, `status`, `harga_per_hari`, `tanggal_pembaruan`) VALUES
('RNG0001', 'Melati', 'Kelas 3', 1, 2, 'sarapan, bedcover', 'Tersedia', 300000.00, '2025-06-30 09:24:02'),
('RNG0002', 'Mawarr', 'Kelas 3', 12, 2, 'sarapan, bedcover, makan malamm', 'Perbaikan', 452000.00, '2025-06-27 23:53:28'),
('RNG0003', 'ypip', 'VIP', 12, 3, 'sarapan', 'Perbaikan', 450000.00, '2025-06-30 09:20:45');

-- --------------------------------------------------------

--
-- Struktur dari tabel `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data untuk tabel `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `role`) VALUES
(1, 'admin', 'admin', 'admin'),
(2, 'dokter', 'dokter', 'dokter'),
(3, 'a', 'a', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detail_resep`
--
ALTER TABLE `detail_resep`
  ADD PRIMARY KEY (`kd_detail`),
  ADD KEY `kd_resep` (`kd_resep`),
  ADD KEY `kd_obat` (`kd_obat`);

--
-- Indeks untuk tabel `jadwal_shift`
--
ALTER TABLE `jadwal_shift`
  ADD PRIMARY KEY (`kd_shift`),
  ADD KEY `idx_tanggal_shift` (`tanggal`),
  ADD KEY `idx_kd_petugas` (`kd_petugas`);

--
-- Indeks untuk tabel `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`kd_obat`),
  ADD KEY `idx_nama_obat` (`nama_obat`);

--
-- Indeks untuk tabel `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`kd_pasien`),
  ADD UNIQUE KEY `nik` (`nik`),
  ADD KEY `idx_nama_pasien` (`nama_pasien`),
  ADD KEY `idx_nik` (`nik`);

--
-- Indeks untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD PRIMARY KEY (`kd_pembayaran`),
  ADD KEY `no_registrasi` (`no_registrasi`);

--
-- Indeks untuk tabel `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD PRIMARY KEY (`no_registrasi`),
  ADD KEY `kd_pasien` (`kd_pasien`),
  ADD KEY `kd_petugas` (`kd_petugas`);

--
-- Indeks untuk tabel `petugas_medis`
--
ALTER TABLE `petugas_medis`
  ADD PRIMARY KEY (`kd_petugas`),
  ADD UNIQUE KEY `nik` (`nik`),
  ADD KEY `idx_nama_petugas` (`nama_petugas`),
  ADD KEY `idx_profesi` (`profesi`);

--
-- Indeks untuk tabel `resep`
--
ALTER TABLE `resep`
  ADD PRIMARY KEY (`kd_resep`),
  ADD KEY `no_registrasi` (`no_registrasi`),
  ADD KEY `kd_petugas` (`kd_petugas`);

--
-- Indeks untuk tabel `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`kd_ruangan`);

--
-- Indeks untuk tabel `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `detail_resep`
--
ALTER TABLE `detail_resep`
  ADD CONSTRAINT `detail_resep_ibfk_1` FOREIGN KEY (`kd_resep`) REFERENCES `resep` (`kd_resep`),
  ADD CONSTRAINT `detail_resep_ibfk_2` FOREIGN KEY (`kd_obat`) REFERENCES `obat` (`kd_obat`);

--
-- Ketidakleluasaan untuk tabel `jadwal_shift`
--
ALTER TABLE `jadwal_shift`
  ADD CONSTRAINT `jadwal_shift_ibfk_1` FOREIGN KEY (`kd_petugas`) REFERENCES `petugas_medis` (`kd_petugas`);

--
-- Ketidakleluasaan untuk tabel `pembayaran`
--
ALTER TABLE `pembayaran`
  ADD CONSTRAINT `pembayaran_ibfk_1` FOREIGN KEY (`no_registrasi`) REFERENCES `pendaftaran` (`no_registrasi`);

--
-- Ketidakleluasaan untuk tabel `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD CONSTRAINT `pendaftaran_ibfk_1` FOREIGN KEY (`kd_pasien`) REFERENCES `pasien` (`kd_pasien`),
  ADD CONSTRAINT `pendaftaran_ibfk_2` FOREIGN KEY (`kd_petugas`) REFERENCES `petugas_medis` (`kd_petugas`);

--
-- Ketidakleluasaan untuk tabel `resep`
--
ALTER TABLE `resep`
  ADD CONSTRAINT `resep_ibfk_1` FOREIGN KEY (`no_registrasi`) REFERENCES `pendaftaran` (`no_registrasi`),
  ADD CONSTRAINT `resep_ibfk_2` FOREIGN KEY (`kd_petugas`) REFERENCES `petugas_medis` (`kd_petugas`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
