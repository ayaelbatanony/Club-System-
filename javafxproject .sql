-- phpMyAdmin SQL Dump
-- version 6.0.0-dev+20230304.e7bc504387
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 09, 2023 at 09:59 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javafxproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `a_fname` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `a_lname` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `a_email` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `a_password` varchar(10) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`a_fname`, `a_lname`, `a_email`, `a_password`) VALUES
('aya', 'hassan', 'aya@gmail.com', 'aya');

-- --------------------------------------------------------

--
-- Table structure for table `admin_me`
--

CREATE TABLE `admin_me` (
  `a_fname` varchar(100) NOT NULL,
  `a_lname` varchar(100) NOT NULL,
  `a_email` varchar(100) NOT NULL,
  `a_password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `basant`
--

CREATE TABLE `basant` (
  `corsename` text DEFAULT NULL,
  `coachname` text DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `session1` text DEFAULT NULL,
  `session2` text DEFAULT NULL,
  `session3` text DEFAULT NULL,
  `session4` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `basant`
--

INSERT INTO `basant` (`corsename`, `coachname`, `price`, `session1`, `session2`, `session3`, `session4`) VALUES
('Swimming', 'Sara', 150, '12-2-2022 8AM', '6-6-2022 6AM', '7-1-2022 8AM', '17-3-2022 10AM'),
('Cycling', 'Maher', 50, '10-1-2022 5PM', '3-1-2022 2PM', '15-12-2022 1PM', '11-11-2022 11PM'),
('Tennis', 'Alaa', 300, '6-4-2022 10PM', '16-5-2022 5PM', '25-2-2022 3PM', '27-12-2022 1PM'),
('Football', 'Ahmed', 100, '5-1-2022 4PM', '15-4-2022 8AM', '20-10-2022 1PM', '18-8-2022 7AM'),
('Running', 'Mohammed', 500, NULL, NULL, NULL, NULL),
('Vollyball', 'Maha', 80, NULL, NULL, NULL, NULL),
('Music', 'Eslam', 800, NULL, NULL, NULL, NULL),
('Pooling', 'Ahmed', 600, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `basant_old`
--

CREATE TABLE `basant_old` (
  `corsename` text NOT NULL,
  `coachname` text NOT NULL,
  `price` int(11) NOT NULL,
  `session1` varchar(100) NOT NULL,
  `session2` varchar(100) NOT NULL,
  `session3` varchar(100) NOT NULL,
  `session4` varchar(100) NOT NULL,
  `session5` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `basant_old`
--

INSERT INTO `basant_old` (`corsename`, `coachname`, `price`, `session1`, `session2`, `session3`, `session4`, `session5`) VALUES
('horse', 'basant', 20, '', '', '', '', ''),
('horse', 'basant', 20, '', '', '', '', ''),
('Golfing', 'basma', 30, '', '', '', '', ''),
('Football', 'Aya', 50, '', '', '', '', ''),
('A', 'b', 10, '', '', '', '', ''),
('n', 'o', 10, '', '', '', '', ''),
('cycling', 'Sara', 10, '', '', '', '', ''),
('Vollyball', 'Adel', 500, '', '', '', '', ''),
('Running', 'Ahmed', 5000, '', '', '', '', ''),
('Vollyball', 'merna', 150, '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `coach`
--

CREATE TABLE `coach` (
  `c_fname` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `c_lname` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `c_email` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `c_password` varchar(10) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `coach`
--

INSERT INTO `coach` (`c_fname`, `c_lname`, `c_email`, `c_password`) VALUES
('basma', 'mohamed', 'basmamohamed@gmail.com', 'Basma123'),
('eslam', 'samir', 'eslam@gmail.com', 'eslam'),
('maha', 'ahmed', 'maha@gmail.com', 'maha'),
('mahmoud', 'ahmed', 'mo@gmail.com', '12345678');

-- --------------------------------------------------------

--
-- Table structure for table `coach_me`
--

CREATE TABLE `coach_me` (
  `c_fname` varchar(100) NOT NULL,
  `c_lname` varchar(100) NOT NULL,
  `c_email` varchar(100) NOT NULL,
  `c_password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `coach_me`
--

INSERT INTO `coach_me` (`c_fname`, `c_lname`, `c_email`, `c_password`) VALUES
('Ahmed', 'Ali', 'ahmed@gmail.com', '1234'),
('Mohammed', 'Mohi', 'mo@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `hoppy_me`
--

CREATE TABLE `hoppy_me` (
  `u_email` varchar(100) NOT NULL,
  `c_email` varchar(100) NOT NULL,
  `h_name` varchar(100) NOT NULL,
  `price` int(100) NOT NULL,
  `session` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hoppy_me`
--

INSERT INTO `hoppy_me` (`u_email`, `c_email`, `h_name`, `price`, `session`) VALUES
('aya@gmail.com', 'ahmed@gmail.com', 'football', 5000, '50'),
('adel@gmail.com', 'ahmed@gmail.com', 'cycling', 1000, '100'),
('', '', 'basketball', 0, '800'),
('aya@gmail.com', 'mo@gmail.com', 'football', 8000, '1200'),
('aya@gmail.com', 'mo@gmail.com', 'Tennis', 8000, '2200'),
('aya@gmail.com', 'mo@gmail.com', 'Tennis', 8000, '2300'),
('aya@gmail.com', 'mo@gmail.com', 'Tennis', 8000, '2000'),
('aya@gmail.com', 'mo@gmail.com', 'Football', 8000, '1200'),
('alaa@gmail.com', 'mohammed@gmail.com', 'Football', 8000, '1200');

-- --------------------------------------------------------

--
-- Table structure for table `session`
--

CREATE TABLE `session` (
  `h_name` text DEFAULT NULL,
  `c_email` text DEFAULT NULL,
  `session1` text NOT NULL,
  `session2` text DEFAULT NULL,
  `session3` text DEFAULT NULL,
  `session4` text DEFAULT NULL,
  `session5` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session`
--

INSERT INTO `session` (`h_name`, `c_email`, `session1`, `session2`, `session3`, `session4`, `session5`) VALUES
(NULL, ' ', 'monday at 5 pm', NULL, NULL, NULL, NULL),
(NULL, ' ', 'friday at 7am', NULL, NULL, NULL, NULL),
(NULL, ' ', 'every day at 4 PM', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `session4`
--

CREATE TABLE `session4` (
  `session1` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session4`
--

INSERT INTO `session4` (`session1`) VALUES
('everyday at 8pm'),
('everyday at 5 pm');

-- --------------------------------------------------------

--
-- Table structure for table `session_1`
--

CREATE TABLE `session_1` (
  `session1` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session_1`
--

INSERT INTO `session_1` (`session1`) VALUES
('eveyday at 8 AM'),
('wednesday at 4PM');

-- --------------------------------------------------------

--
-- Table structure for table `session_2`
--

CREATE TABLE `session_2` (
  `session1` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session_2`
--

INSERT INTO `session_2` (`session1`) VALUES
('SUNDAY&MONDAY AT 3 PM'),
('monday'),
('SUNDAY&MONDAY AT 3 PM'),
('monday at 5 am');

-- --------------------------------------------------------

--
-- Table structure for table `session_3`
--

CREATE TABLE `session_3` (
  `session1` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session_3`
--

INSERT INTO `session_3` (`session1`) VALUES
('SUNDAY AT 4.5 PM'),
('SUNDAY AT 3 PM'),
('wednesday at 4PM');

-- --------------------------------------------------------

--
-- Table structure for table `session_me`
--

CREATE TABLE `session_me` (
  `h_name` varchar(100) NOT NULL,
  `c_email` varchar(100) NOT NULL,
  `session1` varchar(100) NOT NULL,
  `session2` varchar(100) NOT NULL,
  `session3` varchar(100) NOT NULL,
  `session4` varchar(100) NOT NULL,
  `session5` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `session_me`
--

INSERT INTO `session_me` (`h_name`, `c_email`, `session1`, `session2`, `session3`, `session4`, `session5`) VALUES
('football', 'ahmed@gmail.com', '1000', '1100', '1200', '1300', '1400'),
('tennis', 'mo@gmail.com', '2000', '2100', '2200', '2300', '2400');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `u_fname` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `u_lname` varchar(20) COLLATE utf8_turkish_ci NOT NULL,
  `u_email` varchar(100) COLLATE utf8_turkish_ci NOT NULL,
  `u_password` varchar(10) COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`u_fname`, `u_lname`, `u_email`, `u_password`) VALUES
('Alaa', 'Hathout', 'alaa@gmail.com', '12345678'),
('nor', 'mahmoud', 'nor@gmail.com', 'nor'),
('rahma', 'shref', 'rahma@gmail.com', 'rahma'),
('sara', 'ahmed', 'sara@gmail.com', 'sara1234'),
('wael', 'ahmed', 'wael@gmail.com', 'asdfghjk'),
('Yomna', 'Ahmed', 'yomna@gmail.com', 'qwertyui');

-- --------------------------------------------------------

--
-- Table structure for table `userform1`
--

CREATE TABLE `userform1` (
  `h_name` varchar(100) NOT NULL,
  `session1` varchar(100) NOT NULL,
  `session2` varchar(100) NOT NULL,
  `session3` varchar(100) NOT NULL,
  `session4` varchar(100) NOT NULL,
  `session5` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userform1`
--

INSERT INTO `userform1` (`h_name`, `session1`, `session2`, `session3`, `session4`, `session5`, `price`) VALUES
('Football', '1-1-2022 5PM', '1-2-2022 6PM', '1-3-2022 7PM', '3-1-2022 9PM', '2-2-2022 3PM', '100'),
('Tennis', '5-1-2022 5PM', '5-2-2022 6PM', '2-3-2022 7PM', '4-1-2022 9PM', '7-2-2022 3PM', '300'),
('Swimming', '10-1-2022 10PM', '11-2-2022 2PM', '13-3-2022 7PM', '29-1-2022 5PM', '2-2-2022 3PM', '200'),
('Cycling', '10-10-2022 5PM', '5-2-2022 1PM', '3-3-2022 7PM', '7-3-2022 12PM', '20-2-2022 3PM', '90'),
('Basketball', '11-11-2022 11PM', '12-4-2022 3PM', '4-3-2022 7PM', '3-10-2022 7PM', '13-2-2022 3PM', '500');

-- --------------------------------------------------------

--
-- Table structure for table `userform2`
--

CREATE TABLE `userform2` (
  `u_email` varchar(100) NOT NULL,
  `h_name` varchar(100) NOT NULL,
  `session` varchar(100) NOT NULL,
  `price` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `userform2`
--

INSERT INTO `userform2` (`u_email`, `h_name`, `session`, `price`) VALUES
('alaa@gmail.com', 'Tennis', '5-1-2022 5PM', '300'),
('alaa@gmail.com', 'Basketball', '13-2-2022 3PM', '500'),
('sara@gmail.com', 'Cycling', '5-2-2022 1PM', '90'),
('sara@gmail.com', 'Basketball', '3-10-2022 7PM', '500'),
('rahma@gmail.com', 'Football', '3-1-2022 9PM', '100'),
('nor@gmail.com', 'Cycling', '10-10-2022 5PM', '90'),
('nor@gmail.com', 'Basketball', '3-10-2022 7PM', '500'),
('nor@gmail.com', 'Swimming', '10-1-2022 10PM', '200'),
('nor@gmail.com', 'Football', '1-2-2022 6PM', '100'),
('nor@gmail.com', 'Football', '1-1-2022 5PM', '100'),
('nor@gmail.com', 'Football', '1-1-2022 5PM', '100'),
('nor@gmail.com', 'Cycling', '10-10-2022 5PM', '90'),
('sara@gmail.com', 'Cycling', '10-10-2022 5PM', '90'),
('nor@gmail.com', 'Basketball', '1-11-2022 4PM', '200'),
('', 'Swimming', '12-2-2022 8AM', '150');

-- --------------------------------------------------------

--
-- Table structure for table `user_me`
--

CREATE TABLE `user_me` (
  `u_fname` varchar(100) NOT NULL,
  `u_lname` varchar(100) NOT NULL,
  `u_email` varchar(100) NOT NULL,
  `u_password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_me`
--

INSERT INTO `user_me` (`u_fname`, `u_lname`, `u_email`, `u_password`) VALUES
('Aya', 'Hathout', 'aya@gmail.com', '1234'),
('Alaa', 'Hathout', 'alaa@gmail.com', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`a_email`),
  ADD UNIQUE KEY `a_password` (`a_password`);

--
-- Indexes for table `coach`
--
ALTER TABLE `coach`
  ADD PRIMARY KEY (`c_email`),
  ADD UNIQUE KEY `c_password` (`c_password`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`u_email`),
  ADD UNIQUE KEY `u_password` (`u_password`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
