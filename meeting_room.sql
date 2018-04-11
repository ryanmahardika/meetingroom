-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2018 at 11:58 AM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `meeting_room`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_fasilitas`
--

CREATE TABLE `data_fasilitas` (
  `id` int(11) NOT NULL,
  `rua_id` int(11) NOT NULL,
  `fas_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_fasilitas`
--

INSERT INTO `data_fasilitas` (`id`, `rua_id`, `fas_id`) VALUES
(1, 1, 1),
(2, 1, 2),
(3, 2, 3),
(4, 3, 1),
(5, 4, 5),
(6, 4, 6),
(7, 5, 1);

-- --------------------------------------------------------

--
-- Table structure for table `data_kerusakan`
--

CREATE TABLE `data_kerusakan` (
  `id` int(11) NOT NULL,
  `rua_id` int(11) NOT NULL,
  `kar_id` int(11) NOT NULL,
  `tanggal_rusak` date NOT NULL,
  `fasilitas_rusak` varchar(100) NOT NULL,
  `deskripsi` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_kerusakan`
--

INSERT INTO `data_kerusakan` (`id`, `rua_id`, `kar_id`, `tanggal_rusak`, `fasilitas_rusak`, `deskripsi`) VALUES
(1, 1, 1, '2018-03-01', 'Layar', 'Robek'),
(2, 4, 6, '2018-03-27', 'Proyektor', 'Tidak bisa menyala'),
(3, 5, 6, '2018-03-29', 'Proyektor', 'Pecah');

-- --------------------------------------------------------

--
-- Table structure for table `data_login`
--

CREATE TABLE `data_login` (
  `id` int(11) NOT NULL,
  `kar_id` int(11) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(10) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_login`
--

INSERT INTO `data_login` (`id`, `kar_id`, `username`, `password`, `email`) VALUES
(1, 1, 'ani1', 'passani', 'ani@gmail.com'),
(2, 2, 'bamblog', 'bam5', 'bambang@gmail.com'),
(3, 3, 'logcand', 'candra1234', 'candra@gmail.com'),
(4, 4, 'donodono', 'd0n0', 'dono@gmail.com'),
(5, 5, 'evilogin', 'ev1ev1', 'evi@gmail.com'),
(6, 6, 'farhanmasuk', 'farfarhan', 'farhan@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `fasilitas_ruangan`
--

CREATE TABLE `fasilitas_ruangan` (
  `id` int(11) NOT NULL,
  `nama_fasilitas` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `fasilitas_ruangan`
--

INSERT INTO `fasilitas_ruangan` (`id`, `nama_fasilitas`) VALUES
(1, 'Proyektor'),
(2, 'Layar'),
(3, 'Papan Tulis'),
(4, 'WiFi'),
(5, 'Meja'),
(6, 'Kursi');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` int(11) NOT NULL,
  `nik` varchar(10) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jabatan` varchar(10) NOT NULL,
  `no_telpon` varchar(20) NOT NULL,
  `alamat` varchar(150) NOT NULL,
  `ktp` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id`, `nik`, `nama`, `jabatan`, `no_telpon`, `alamat`, `ktp`) VALUES
(1, '1001', 'Ani', 'Staff', '0885123432', 'Tebet', '322143256456'),
(2, '1002', 'Bambang', 'Manajer', '0987132465', 'Kelapa Gading', '345233123234'),
(3, '1003', 'Candra', 'Staff', '0954132243', 'Depok', '332142365335'),
(4, '1004', 'Dono', 'Staff', '0885112345', 'Rawamangun', '312098789675'),
(5, '1005', 'Evi', 'Manajer', '0856143222', 'Pondok Indah', '234123222133'),
(6, '1006', 'Farhan', 'Staff', '0675222123', 'Bogor', '321123111222');

-- --------------------------------------------------------

--
-- Table structure for table `pengajuan`
--

CREATE TABLE `pengajuan` (
  `id` int(11) NOT NULL,
  `rua_id` int(11) NOT NULL,
  `kar_id` int(11) NOT NULL,
  `kode_order` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `mulai` time NOT NULL,
  `selesai` time NOT NULL,
  `subjek` varchar(50) NOT NULL,
  `deskripsi_meeting` varchar(200) NOT NULL,
  `waktu_order` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `status_pengajuan` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengajuan`
--

INSERT INTO `pengajuan` (`id`, `rua_id`, `kar_id`, `kode_order`, `tanggal`, `mulai`, `selesai`, `subjek`, `deskripsi_meeting`, `waktu_order`, `status_pengajuan`) VALUES
(1, 1, 1, 101, '2018-04-16', '14:00:00', '15:00:00', 'Meeting internal', 'Meeting tentang keuangan project', '2018-04-11 09:51:30', 'Approved'),
(2, 3, 6, 102, '2018-04-13', '11:00:00', '12:00:00', 'Pengarahan', '', '2018-04-11 09:51:41', 'Approved'),
(3, 2, 3, 103, '2018-04-16', '10:30:00', '12:00:00', 'Meeting dengan klien', 'Klien dari Singapura', '2018-04-11 09:45:45', 'Pending'),
(4, 1, 2, 104, '2018-04-17', '10:00:00', '11:00:00', 'Meeting bulanan', 'review project', '2018-04-11 09:48:00', 'Pending'),
(5, 1, 4, 105, '2018-04-17', '10:00:00', '11:00:00', 'Meeting internal', 'review', '2018-04-11 09:51:01', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `peserta`
--

CREATE TABLE `peserta` (
  `id` int(11) NOT NULL,
  `pen_id` int(11) NOT NULL,
  `kar_id` int(11) NOT NULL,
  `status_hadir` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peserta`
--

INSERT INTO `peserta` (`id`, `pen_id`, `kar_id`, `status_hadir`) VALUES
(1, 1, 2, 'Hadir'),
(2, 2, 5, 'Mungkin'),
(3, 2, 4, 'Hadir'),
(4, 3, 2, 'Pending'),
(5, 4, 1, 'Pending'),
(6, 4, 3, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `id` int(11) NOT NULL,
  `kode_ruangan` int(11) NOT NULL,
  `nama_ruangan` varchar(25) NOT NULL,
  `kapasitas` int(11) NOT NULL,
  `status_ruangan` varchar(20) NOT NULL,
  `fasilitas_tambahan` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ruangan`
--

INSERT INTO `ruangan` (`id`, `kode_ruangan`, `nama_ruangan`, `kapasitas`, `status_ruangan`, `fasilitas_tambahan`) VALUES
(1, 101, 'Anggrek', 20, 'Tersedia', ''),
(2, 102, 'Bakau', 50, 'Tersedia', ''),
(3, 103, 'Cempaka', 15, 'Tersedia', 'Terminal Charger'),
(4, 104, 'Dahlia', 25, 'Tidak Tersedia', ''),
(5, 105, 'Edelweiss', 35, 'Tidak Tersedia', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_fasilitas`
--
ALTER TABLE `data_fasilitas`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Ruangan_DataFasilitas` (`rua_id`),
  ADD KEY `FK_Fasilitas_DataFasilitas` (`fas_id`);

--
-- Indexes for table `data_kerusakan`
--
ALTER TABLE `data_kerusakan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Ruangan_Kerusakan` (`rua_id`),
  ADD KEY `FK_Karyawan_Kerusakan` (`kar_id`);

--
-- Indexes for table `data_login`
--
ALTER TABLE `data_login`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Karyawan_Login` (`kar_id`);

--
-- Indexes for table `fasilitas_ruangan`
--
ALTER TABLE `fasilitas_ruangan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Karyawan_Pengajuan` (`kar_id`),
  ADD KEY `FK_Ruangan_Pengajuan` (`rua_id`);

--
-- Indexes for table `peserta`
--
ALTER TABLE `peserta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK_Karyawan_Peserta` (`kar_id`),
  ADD KEY `FK_Pengajuan_Peserta` (`pen_id`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kode_ruangan` (`kode_ruangan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_fasilitas`
--
ALTER TABLE `data_fasilitas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `data_kerusakan`
--
ALTER TABLE `data_kerusakan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `data_login`
--
ALTER TABLE `data_login`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `fasilitas_ruangan`
--
ALTER TABLE `fasilitas_ruangan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `pengajuan`
--
ALTER TABLE `pengajuan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `peserta`
--
ALTER TABLE `peserta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `ruangan`
--
ALTER TABLE `ruangan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_fasilitas`
--
ALTER TABLE `data_fasilitas`
  ADD CONSTRAINT `FK_Fasilitas_DataFasilitas` FOREIGN KEY (`fas_id`) REFERENCES `fasilitas_ruangan` (`id`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Ruangan_DataFasilitas` FOREIGN KEY (`rua_id`) REFERENCES `ruangan` (`id`) ON UPDATE NO ACTION;

--
-- Constraints for table `data_kerusakan`
--
ALTER TABLE `data_kerusakan`
  ADD CONSTRAINT `FK_Karyawan_Kerusakan` FOREIGN KEY (`kar_id`) REFERENCES `karyawan` (`id`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Ruangan_Kerusakan` FOREIGN KEY (`rua_id`) REFERENCES `ruangan` (`id`) ON UPDATE NO ACTION;

--
-- Constraints for table `data_login`
--
ALTER TABLE `data_login`
  ADD CONSTRAINT `FK_Karyawan_Login` FOREIGN KEY (`kar_id`) REFERENCES `karyawan` (`id`) ON UPDATE NO ACTION;

--
-- Constraints for table `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD CONSTRAINT `FK_Karyawan_Pengajuan` FOREIGN KEY (`kar_id`) REFERENCES `karyawan` (`id`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Ruangan_Pengajuan` FOREIGN KEY (`rua_id`) REFERENCES `ruangan` (`id`) ON UPDATE NO ACTION;

--
-- Constraints for table `peserta`
--
ALTER TABLE `peserta`
  ADD CONSTRAINT `FK_Karyawan_Peserta` FOREIGN KEY (`kar_id`) REFERENCES `karyawan` (`id`) ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_Pengajuan_Peserta` FOREIGN KEY (`pen_id`) REFERENCES `pengajuan` (`id`) ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
