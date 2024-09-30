-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 29, 2024 at 05:00 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lms`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bookID` varchar(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `author` varchar(20) DEFAULT NULL,
  `publishedyear` varchar(20) DEFAULT NULL,
  `price` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bookID`, `name`, `author`, `publishedyear`, `price`) VALUES
('1', 'Harry Porter', 'JK. Rowling', '1997', '100$'),
('2', 'Chemistry', 'Jarshan', '2000', '700$'),
('3', 'Time Machine', 'H.G Wells', '2003', '50$'),
('4', 'Maths', 'Jarshan', '2005', '125$');

-- --------------------------------------------------------

--
-- Table structure for table `issue`
--

CREATE TABLE `issue` (
  `bookID` varchar(10) DEFAULT NULL,
  `studentID` varchar(10) DEFAULT NULL,
  `issueDate` varchar(20) DEFAULT NULL,
  `dueDate` varchar(20) DEFAULT NULL,
  `returnBook` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `issue`
--

INSERT INTO `issue` (`bookID`, `studentID`, `issueDate`, `dueDate`, `returnBook`) VALUES
('1', '20APC4672', '28-09-2024', '30-09-2024', 'YES'),
('3', '20APC4765', '28-09-2024', '04-08-2024', 'No'),
('2', '20APC4680', '28-09-2024', '02-08-2024', 'YES'),
('2', '20APC4555', '27-09-2024', '30-09-2024', 'No'),
('4', '20APC4670', '29-09-2024', '30-09-2024', 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `studentID` varchar(10) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `fatherName` varchar(20) DEFAULT NULL,
  `facultyName` varchar(30) DEFAULT NULL,
  `courseName` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`studentID`, `name`, `fatherName`, `facultyName`, `courseName`) VALUES
('1', 'Mohamed Jarshan', 'Jauffar', 'Computing', 'Information System'),
('20APC4555', 'Sithum', 'Wikremasinga', 'Computing', 'Information System'),
('20APC4670', 'Jashan', 'AB. Jauffar', 'Applied Science', 'Sports Science'),
('20APC4672', 'Mohamed Jarshan', 'AB Jauffar', 'Computing', 'Information System'),
('20APC4680', 'Shashini', 'Perera', 'Technology', 'Natural Resources'),
('20APC4753', 'Sithum', 'Ravi', 'Applied Science', 'Sports Science'),
('20APC4765', 'Isuri', 'Kumar Dharmasena', 'Agricultural Science', 'Natural Resources'),
('20APSE5674', 'Sujair', 'Ibrahim', 'Computing', 'Software Engineer');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bookID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`studentID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
