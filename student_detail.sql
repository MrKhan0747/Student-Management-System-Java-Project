-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2018 at 02:16 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student`
--

-- --------------------------------------------------------

--
-- Table structure for table `student_detail`
--

CREATE TABLE `student_detail` (
  `ROLL_NO` int(11) NOT NULL,
  `FIRST_NAME` char(20) DEFAULT NULL,
  `LAST_NAME` char(20) DEFAULT NULL,
  `MOBILE` bigint(10) DEFAULT NULL,
  `DIVISION` char(5) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_detail`
--

INSERT INTO `student_detail` (`ROLL_NO`, `FIRST_NAME`, `LAST_NAME`, `MOBILE`, `DIVISION`, `AGE`) VALUES
(1, 'Hamzah', 'Khan', 1234567890, 'A', 20),
(2, 'John', 'Smith', 1234567890, 'A', 21),
(3, 'Mark', 'Wood', 1122334455, 'B', 19);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `student_detail`
--
ALTER TABLE `student_detail`
  ADD PRIMARY KEY (`ROLL_NO`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
