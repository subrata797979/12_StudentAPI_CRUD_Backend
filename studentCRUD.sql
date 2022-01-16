-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Dec 15, 2021 at 04:30 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lindaschool`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` bigint(20) NOT NULL,
  `course` varchar(30) DEFAULT NULL,
  `fee` int(11) NOT NULL,
  `studentname` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `course`, `fee`, `studentname`) VALUES
(1, 'Java', 11000, 'Subrata Halder'),
(2, 'Python', 9000, 'Ayan Paul '),
(54, 'Java', 12000, 'Saurabh Das'),
(55, 'Python', 10000, 'Rana Chanda');

-- --------------------------------------------------------

--
-- Table structure for table `studentapi`
--

CREATE TABLE `studentapi` (
  `id` bigint(20) NOT NULL,
  `course` varchar(255) DEFAULT NULL,
  `fee` int(11) NOT NULL,
  `studentname` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentapi`
--

INSERT INTO `studentapi` (`id`, `course`, `fee`, `studentname`) VALUES
(1, 'Java', 11000, 'Subrata Halder'),
(2, 'Python', 9000, 'Ayan Paul '),
(3, 'C', 5000, 'Rana Chanda'),
(6, 'Kotlin', 15000, 'Aniket Dutta'),
(7, 'Ruby', 12000, 'Sunita Sarkar'),
(8, 'Python', 12000, 'Aniket Dutta'),
(9, 'Java', 5000, 'Subrata Halder'),
(10, 'Java', 5000, 'Rana Chanda'),
(11, 'Java', 12000, 'Ayan Paul '),
(12, 'Java', 11000, 'Ayan Paul '),
(13, 'Python', 12000, 'test');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `studentapi`
--
ALTER TABLE `studentapi`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- AUTO_INCREMENT for table `studentapi`
--
ALTER TABLE `studentapi`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
