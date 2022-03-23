-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 27, 2021 at 06:33 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `computer`
--

-- --------------------------------------------------------

--
-- Table structure for table `bills`
--

CREATE TABLE `bills` (
  `bill_id` int(10) NOT NULL,
  `bill_date` date NOT NULL,
  `user_id` varchar(10) NOT NULL,
  `customer_id` varchar(10) NOT NULL,
  `discount` int(10) DEFAULT NULL,
  `total_amount` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bills`
--

INSERT INTO `bills` (`bill_id`, `bill_date`, `user_id`, `customer_id`, `discount`, `total_amount`) VALUES
(560897, '2021-12-26', 'ADM01', 'T01', NULL, 7257);

-- --------------------------------------------------------

--
-- Table structure for table `bill_detail`
--

CREATE TABLE `bill_detail` (
  `id` int(10) NOT NULL,
  `bill_id` int(10) NOT NULL,
  `product_id` varchar(10) NOT NULL,
  `price` int(10) NOT NULL,
  `qty` int(3) NOT NULL,
  `amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `customer_id` varchar(10) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `customer_address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`customer_id`, `customer_name`, `phone`, `customer_address`) VALUES
('AF10', 'Ansu Fati', '1010101010', 'Spain'),
('EH9', 'Erling Haaland', '9999999999', 'Norway'),
('G30', 'Gavi', '3030303030', 'Spain'),
('N27', 'Nico', '2727272727', 'Spain'),
('P16', 'Pedri', '1616161616', 'Spain'),
('RA4', 'Ronald Araujo', '4444444444', 'Uruguay'),
('T01', 'Tuan 74', '12345678', 'Quan Tri'),
('T02', 'Test Second', '321', 'qwer'),
('TS1', 'Ter Stegen', '1111111111', 'Germany'),
('TUAN', 'Tuandepzi', 'Tuan1234', 'Quang Tri');

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `product_id` varchar(10) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `product_img` blob DEFAULT NULL,
  `product_detail` varchar(255) NOT NULL,
  `unit` varchar(10) NOT NULL,
  `price` int(11) NOT NULL,
  `remaining` int(11) NOT NULL,
  `supplier_id` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`product_id`, `product_name`, `product_img`, `product_detail`, `unit`, `price`, `remaining`, `supplier_id`) VALUES
('FL680', 'FL-Esport FL680', NULL, 'Gateron Switch, USB/2.4/Bluetooth', 'psc', 110, 20, 'FL001'),
('GE39', 'GIGABITE GeForce RTX 3090 EAGLE', NULL, '24GB', 'psc', 2500, 56, 'G001'),
('ICI119', 'Intel Core i9 11900', NULL, '8-Core 12-Theard 5.2 GHz', 'psc', 520, 50, 'I001'),
('KF26', 'Kingtons Fury Beast Black 1x8GB 2666', NULL, 'DDR4, 2666', 'psc', 35, 100, 'K001'),
('LG34', 'Logitech G304', NULL, 'Wireless', 'psc', 40, 15, 'L001'),
('LX1G9', 'ThinkPad X1 Carbon Gen 9', 0x433a5c55736572735c48505c4f6e6544726976655c4dc3a1792074c3ad6e685c616e685c5374617469737469632d69636f6e2e706e67, 'i7, 16GB, 250GB SSD', 'psc', 1900, 10, 'L002');

-- --------------------------------------------------------

--
-- Table structure for table `useraccount`
--

CREATE TABLE `useraccount` (
  `user_id` varchar(10) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone_number` varchar(20) NOT NULL,
  `birthday` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `is_admin` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `useraccount`
--

INSERT INTO `useraccount` (`user_id`, `fullname`, `username`, `password`, `address`, `phone_number`, `birthday`, `gender`, `is_admin`) VALUES
('ADM01', 'Lê Đình Tuân', 'a', 'a', 'Quảng Trị', '0968686868', '2001-01-01', 'Male', 1),
('ADM02', 'Hoàng Trọng Sơn', 'hts', '123', 'Đắk Lắk', '0999444888', '2000-01-01', 'Male', 1),
('ADM03', 'Nguyễn Xuân Việt Long', 'vietlong', '123456789', 'Đà Nẵng', '01234568888', '2003-07-07', 'Male', 1),
('EMP01', 'Nguyễn Thị Nhân Viên', 'nhanvien1', '123', 'Hà Nội', '0987667890', '1999-01-09', 'Female', 0),
('EMP02', 'John', 'john', '123', 'America', '8409844737', '2021-12-15', 'Female', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bills`
--
ALTER TABLE `bills`
  ADD PRIMARY KEY (`bill_id`),
  ADD KEY `user_id` (`user_id`),
  ADD KEY `customer_id` (`customer_id`);

--
-- Indexes for table `bill_detail`
--
ALTER TABLE `bill_detail`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_id` (`product_id`),
  ADD KEY `bill_id` (`bill_id`);

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `useraccount`
--
ALTER TABLE `useraccount`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bill_detail`
--
ALTER TABLE `bill_detail`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `bills`
--
ALTER TABLE `bills`
  ADD CONSTRAINT `bills_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `useraccount` (`user_id`),
  ADD CONSTRAINT `bills_ibfk_2` FOREIGN KEY (`customer_id`) REFERENCES `customers` (`customer_id`);

--
-- Constraints for table `bill_detail`
--
ALTER TABLE `bill_detail`
  ADD CONSTRAINT `bill_detail_ibfk_2` FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
  ADD CONSTRAINT `bill_detail_ibfk_3` FOREIGN KEY (`bill_id`) REFERENCES `bills` (`bill_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
