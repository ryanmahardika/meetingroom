-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 09, 2018 at 03:59 AM
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
-- Table structure for table `data_kerusakan`
--

CREATE TABLE `data_kerusakan` (
  `ID` int(11) NOT NULL,
  `RUA_ID` int(11) NOT NULL,
  `KAR_ID` int(11) NOT NULL,
  `TANGGAL_RUSAK` date DEFAULT NULL,
  `FASILITAS_RUSAK` varchar(50) DEFAULT NULL,
  `DESKRIPSI` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_kerusakan`
--

INSERT INTO `data_kerusakan` (`ID`, `RUA_ID`, `KAR_ID`, `TANGGAL_RUSAK`, `FASILITAS_RUSAK`, `DESKRIPSI`) VALUES
(1, 1, 1, '2018-04-03', 'Layar', 'Robek'),
(2, 2, 5, '2018-04-05', 'Proyektor', 'Tidak nyala');

-- --------------------------------------------------------

--
-- Table structure for table `data_login`
--

CREATE TABLE `data_login` (
  `ID` int(11) NOT NULL,
  `KAR_ID` int(11) NOT NULL,
  `USERNAME` varchar(20) DEFAULT NULL,
  `PASSWORD` varchar(20) DEFAULT NULL,
  `EMAIL` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `data_login`
--

INSERT INTO `data_login` (`ID`, `KAR_ID`, `USERNAME`, `PASSWORD`, `EMAIL`) VALUES
(1, 1, 'andilogin', 'andi1', 'andi@gmail.com'),
(2, 2, 'budilogin', 'budi2', 'budi@gmail.com'),
(3, 3, 'candlogin', 'cand3', 'candra@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `ID` int(11) NOT NULL,
  `NIK` int(11) NOT NULL,
  `NAMA` varchar(50) DEFAULT NULL,
  `JABATAN` varchar(20) DEFAULT NULL,
  `NO_TELPON` varchar(20) DEFAULT NULL,
  `ALAMAT` varchar(100) DEFAULT NULL,
  `KTP` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`ID`, `NIK`, `NAMA`, `JABATAN`, `NO_TELPON`, `ALAMAT`, `KTP`) VALUES
(1, 101, 'Andi', 'Staff', '0857123321', 'Cikini', 322098123),
(2, 102, 'Budi', 'Manajer', '0814321432', 'Pondok Indah', 332456345),
(3, 103, 'Candra', 'Staff', '0876234345', 'Bekasi', 345123233),
(4, 104, 'Dedi', 'Staff', '0897345453', 'Depok', 327654354),
(5, 105, 'Edi', 'Staff', '0852342333', 'Tangerang', 345876123),
(6, 106, 'Farhan', 'Manajer', '0856453278', 'Tebet', 356789012);

-- --------------------------------------------------------

--
-- Table structure for table `pengajuan`
--

CREATE TABLE `pengajuan` (
  `ID` int(11) NOT NULL,
  `RUA_ID` int(11) NOT NULL,
  `ID_ORDER` int(11) NOT NULL,
  `KAR_ID` int(11) NOT NULL,
  `TANGGAL` date DEFAULT NULL,
  `MULAI` time DEFAULT NULL,
  `SELESAI` time DEFAULT NULL,
  `SUBJEK` varchar(100) DEFAULT NULL,
  `WAKTU_ORDER` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `STATUS_PENGAJUAN` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pengajuan`
--

INSERT INTO `pengajuan` (`ID`, `RUA_ID`, `ID_ORDER`, `KAR_ID`, `TANGGAL`, `MULAI`, `SELESAI`, `SUBJEK`, `WAKTU_ORDER`, `STATUS_PENGAJUAN`) VALUES
(1, 1, 1001, 3, '2018-04-12', '14:00:00', '15:00:00', 'Meeting Internal', '2018-04-09 01:53:13', 'Approved'),
(2, 2, 1002, 1, '2018-04-11', '10:30:00', '11:30:00', 'Meeting Bulanan', '2018-04-09 01:43:38', 'Pending'),
(3, 3, 1003, 1, '2018-04-13', '15:30:00', '16:30:00', NULL, '2018-04-09 01:45:02', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `peserta`
--

CREATE TABLE `peserta` (
  `ID` int(11) NOT NULL,
  `PEN_ID` int(11) NOT NULL,
  `KAR_ID` int(11) NOT NULL,
  `STATUS_HADIR` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `peserta`
--

INSERT INTO `peserta` (`ID`, `PEN_ID`, `KAR_ID`, `STATUS_HADIR`) VALUES
(1, 1, 1, 'Pending'),
(2, 1, 4, 'Hadir'),
(3, 3, 2, 'Pending'),
(4, 3, 6, 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `ID` int(11) NOT NULL,
  `KODE_RUANG` int(11) NOT NULL,
  `NAMA_RUANG` varchar(50) DEFAULT NULL,
  `KAPASITAS` int(11) DEFAULT NULL,
  `STATUS_RUANGAN` varchar(20) DEFAULT NULL,
  `FASILITAS` varchar(50) DEFAULT NULL,
  `FASILITAS_TAMBAHAN` varchar(75) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ruangan`
--

INSERT INTO `ruangan` (`ID`, `KODE_RUANG`, `NAMA_RUANG`, `KAPASITAS`, `STATUS_RUANGAN`, `FASILITAS`, `FASILITAS_TAMBAHAN`) VALUES
(1, 1, 'Ruang A', 20, 'Tersedia', 'Proyektor', NULL),
(2, 2, 'Ruang B', 15, 'Tersedia', 'WiFi', 'Dispenser'),
(3, 3, 'Ruang C', 25, 'Tersedia', 'Papan Tulis', NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_kerusakan`
--
ALTER TABLE `data_kerusakan`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_DATA_KERUSAKAN` (`KAR_ID`),
  ADD KEY `FK_DATA_KERUSAKAN2` (`RUA_ID`);

--
-- Indexes for table `data_login`
--
ALTER TABLE `data_login`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_LOGIN` (`KAR_ID`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PENGAJUAN` (`KAR_ID`),
  ADD KEY `FK_PENGAJUAN2` (`RUA_ID`);

--
-- Indexes for table `peserta`
--
ALTER TABLE `peserta`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `FK_PESERTA4` (`KAR_ID`),
  ADD KEY `FK_PESERTA5` (`PEN_ID`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`ID`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_kerusakan`
--
ALTER TABLE `data_kerusakan`
  ADD CONSTRAINT `FK_DATA_KERUSAKAN` FOREIGN KEY (`KAR_ID`) REFERENCES `karyawan` (`ID`),
  ADD CONSTRAINT `FK_DATA_KERUSAKAN2` FOREIGN KEY (`RUA_ID`) REFERENCES `ruangan` (`ID`);

--
-- Constraints for table `data_login`
--
ALTER TABLE `data_login`
  ADD CONSTRAINT `FK_LOGIN` FOREIGN KEY (`KAR_ID`) REFERENCES `karyawan` (`ID`);

--
-- Constraints for table `pengajuan`
--
ALTER TABLE `pengajuan`
  ADD CONSTRAINT `FK_PENGAJUAN` FOREIGN KEY (`KAR_ID`) REFERENCES `karyawan` (`ID`),
  ADD CONSTRAINT `FK_PENGAJUAN2` FOREIGN KEY (`RUA_ID`) REFERENCES `ruangan` (`ID`);

--
-- Constraints for table `peserta`
--
ALTER TABLE `peserta`
  ADD CONSTRAINT `FK_PESERTA4` FOREIGN KEY (`KAR_ID`) REFERENCES `karyawan` (`ID`),
  ADD CONSTRAINT `FK_PESERTA5` FOREIGN KEY (`PEN_ID`) REFERENCES `pengajuan` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
