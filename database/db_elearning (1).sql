-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 11, 2025 at 07:26 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_elearning`
--

-- --------------------------------------------------------

--
-- Table structure for table `dataguru`
--

CREATE TABLE `dataguru` (
  `NIP` char(100) NOT NULL,
  `Nama_Guru` char(100) DEFAULT NULL,
  `Jenis_Kelamin` char(100) DEFAULT NULL,
  `No_Telp` varchar(100) DEFAULT NULL,
  `Email` char(100) DEFAULT NULL,
  `Nama_Mapel` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataguru`
--

INSERT INTO `dataguru` (`NIP`, `Nama_Guru`, `Jenis_Kelamin`, `No_Telp`, `Email`, `Nama_Mapel`) VALUES
('19982404', 'Ratna Kania', 'Perempuan', '081278872902', 'ratnakania@gmail.com', 'Matematika');

-- --------------------------------------------------------

--
-- Table structure for table `datasiswa`
--

CREATE TABLE `datasiswa` (
  `NIS` char(100) NOT NULL,
  `Nama_Siswa` char(100) DEFAULT NULL,
  `Tempat_Tanggal_Lahir` varchar(100) DEFAULT NULL,
  `Jenis_Kelamin` char(100) DEFAULT NULL,
  `No_Telp` varchar(100) DEFAULT NULL,
  `Email` char(100) DEFAULT NULL,
  `Jurusan` char(100) DEFAULT NULL,
  `Kelas` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `datasiswa`
--

INSERT INTO `datasiswa` (`NIS`, `Nama_Siswa`, `Tempat_Tanggal_Lahir`, `Jenis_Kelamin`, `No_Telp`, `Email`, `Jurusan`, `Kelas`) VALUES
('2501502039', 'Khayla Aulia Syafia', 'Jakarta, 28 Agustus 2009', 'Perempuan', '081920024589', 'khayalaulia28@gmail.com', 'Teknologi Komputer Jaringan', 'XI');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `Id_Jadwal` char(100) NOT NULL,
  `Nama_Guru` char(100) DEFAULT NULL,
  `Nama_Mapel` char(100) DEFAULT NULL,
  `Jurusan` char(100) DEFAULT NULL,
  `Kelas` char(100) DEFAULT NULL,
  `Hari` char(100) DEFAULT NULL,
  `Jam` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`Id_Jadwal`, `Nama_Guru`, `Nama_Mapel`, `Jurusan`, `Kelas`, `Hari`, `Jam`) VALUES
('213823', 'Ratna Kania', 'Matematika', 'Akuntansi', 'XI', 'Senin', '07:00:00');

-- --------------------------------------------------------

--
-- Table structure for table `mapel`
--

CREATE TABLE `mapel` (
  `Id_Mapel` char(100) NOT NULL,
  `Nama_Mapel` char(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mapel`
--

INSERT INTO `mapel` (`Id_Mapel`, `Nama_Mapel`) VALUES
('B123409', 'Bahasa Indonesia');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dataguru`
--
ALTER TABLE `dataguru`
  ADD PRIMARY KEY (`NIP`);

--
-- Indexes for table `datasiswa`
--
ALTER TABLE `datasiswa`
  ADD PRIMARY KEY (`NIS`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`Id_Jadwal`);

--
-- Indexes for table `mapel`
--
ALTER TABLE `mapel`
  ADD PRIMARY KEY (`Id_Mapel`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
