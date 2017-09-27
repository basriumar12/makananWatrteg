-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 04, 2017 at 04:10 AM
-- Server version: 10.1.19-MariaDB
-- PHP Version: 5.5.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_makananretbas`
--

-- --------------------------------------------------------

--
-- Table structure for table `makanankhas`
--

CREATE TABLE `makanankhas` (
  `id_makanan` int(5) NOT NULL,
  `nama` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `detail` text COLLATE latin1_general_ci NOT NULL,
  `gambar` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `harga` int(11) NOT NULL,
  `status` varchar(11) COLLATE latin1_general_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci;

--
-- Dumping data for table `makanankhas`
--

INSERT INTO `makanankhas` (`id_makanan`, `nama`, `detail`, `gambar`, `harga`, `status`) VALUES
(1, 'bakso', 'bakso adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'bakso.jpg', 100000, 'tersedia'),
(2, 'gado-gado', 'gado-gado adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'gadogado.jpg', 150000, 'kosong'),
(3, 'gorengan', 'gorengan adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'gorengan.jpg', 80000, 'tersedia'),
(4, 'gudeg', 'gudeg adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'gudeg.jpg', 170000, 'tersedia'),
(5, 'opor-ayam', 'oporayam adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'oporayam.jpg', 100000, 'tersedia'),
(6, 'pempek', 'pempek adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'pempek.jpg', 90000, 'tersedia'),
(7, 'rawon', 'rawon adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'rawon.jpg', 95000, 'tersedia'),
(8, 'rendang', 'rendang adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat.', 'rendang.jpg', 85000, 'kosong'),
(9, 'soto', 'soto adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat.', 'soto.jpg', 70000, 'tersedia'),
(10, 'nasi kuning', 'nasi kuning adalah sebuah makanan yang cukup banyak di jual di beberapa tempat makan yang ada di Indonesia, pasalnya Ketoprak adalah makanan khas indonesia yang cukup dekat dengan masyarakat luas atau bisa di katakan makanan indonesia yang satu ini sangat merakyat. Ketoprak sangat erat kaitannya dengan ketupat, pasalnya sebagaian besar Ketoprak yang di sajikan di indonesia ini di hadirkan dengan menggunkan ketupat', 'nasikuning.jpg', 100000, 'kosong');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `makanankhas`
--
ALTER TABLE `makanankhas`
  ADD PRIMARY KEY (`id_makanan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `makanankhas`
--
ALTER TABLE `makanankhas`
  MODIFY `id_makanan` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=149;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
