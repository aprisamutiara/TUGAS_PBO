-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2024 at 11:20 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kacamoo_pbo_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbkacamata`
--

CREATE TABLE `tbkacamata` (
  `id` int(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `no_telp` text NOT NULL,
  `frame` varchar(30) NOT NULL,
  `warna` varchar(20) NOT NULL,
  `minus_kanan` float NOT NULL,
  `minus_kiri` float NOT NULL,
  `silinder_kanan` float NOT NULL,
  `silinder_kiri` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbkacamata`
--

INSERT INTO `tbkacamata` (`id`, `nama`, `no_telp`, `frame`, `warna`, `minus_kanan`, `minus_kiri`, `silinder_kanan`, `silinder_kiri`) VALUES
(20, 'Aprisa Idma Mutiara', '081234567890', 'Kotak', 'Hitam', 0.1, 0.2, 1.2, 1.75),
(21, 'Narupa Rangga Goroguta', '081243658709', 'Cat eye', 'Rose gold', 1, 1.3, 2, 0.5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbkacamata`
--
ALTER TABLE `tbkacamata`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbkacamata`
--
ALTER TABLE `tbkacamata`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
