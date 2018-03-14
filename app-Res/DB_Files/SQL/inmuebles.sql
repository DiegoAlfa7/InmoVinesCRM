-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-03-2018 a las 14:20:44
-- Versión del servidor: 10.1.30-MariaDB
-- Versión de PHP: 5.6.33

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `InmoVinesCRM`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmuebles`
--

CREATE TABLE `inmuebles` (

  `ID` bigint(20) NOT NULL,
  `id_cliente` bigint(20) DEFAULT NULL,
  `id_agente` bigint(20) DEFAULT NULL,
  
  
  
  `referencia_catastral` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `referencia` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(1500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `texto_reclamo` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `gastos_comunidad` int(11) DEFAULT NULL,
  `altura_edificio` smallint(5) UNSIGNED DEFAULT NULL,
  

  
  `pais` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `provincia` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `poblacion` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `zona` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `cp` varchar(5) COLLATE utf8_spanish_ci DEFAULT NULL,
  
  `latitud` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `longitud` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  

  `direccion_tipo_via` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion_calle` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion_numero` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion_piso` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion_letra` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `direccion_escalera` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,

  

  

  
  `precio_compra` double DEFAULT NULL,
  `precio_alquiler` double DEFAULT NULL,
  `precio_traspaso` double DEFAULT NULL,
  `precio_alquiler_opcion_compra` double DEFAULT NULL,
  

  
  
  `n_habitaciones` smallint(5) UNSIGNED DEFAULT NULL, 
  `n_banos` smallint(5) UNSIGNED DEFAULT NULL,
  `n_aseos` smallint(5) UNSIGNED DEFAULT NULL,
  `m2_utiles` double DEFAULT NULL,
  `m2_construidos` float DEFAULT NULL,
  `m2_terreno` double DEFAULT NULL,
  `estado_conservacion` varchar(30) NOT NULL,
  
  
  `visible` BOOLEAN DEFAULT FALSE,
  `zona_deportiva` BOOLEAN DEFAULT FALSE,
  `amueblado` BOOLEAN DEFAULT FALSE,
  `garaje` BOOLEAN DEFAULT FALSE,
  `calefaccion` BOOLEAN DEFAULT FALSE,
  `aire_acondicionado` BOOLEAN DEFAULT FALSE,
  `piscina` BOOLEAN DEFAULT FALSE,
  `jardin` BOOLEAN DEFAULT FALSE,
  `trastero` BOOLEAN DEFAULT FALSE,
  `ascensor` BOOLEAN DEFAULT FALSE,
  `terraza` BOOLEAN DEFAULT FALSE,
  `piso_banco` BOOLEAN DEFAULT FALSE,
  `vpo` BOOLEAN DEFAULT FALSE,
  `reservado` BOOLEAN DEFAULT FALSE,
   
  
  `eficiencia_energetica_tipo` varchar(1) COLLATE utf8_spanish_ci DEFAULT NULL,
  `eficiencia_energetica_entramite_01` tinyint(1) NOT NULL,
  `eficiencia_energetica_fecvalid` date DEFAULT NULL,
  `eficiencia_energetica_emisiones` float DEFAULT NULL,

  
  
  `orientacion_solar` varchar(6) DEFAULT NULL,
  `suelos` varchar(20) DEFAULT NULL,
  `carpinteria_exterior` varchar(20) DEFAULT NULL,
  `carpinteria_interior` varchar(20) DEFAULT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- RELACIONES PARA LA TABLA `inmuebles`:
--

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `inmuebles`
--
ALTER TABLE `inmuebles`
  ADD PRIMARY KEY (`c_inmuebles`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `inmuebles`
--
ALTER TABLE `inmuebles`
  MODIFY `c_inmuebles` bigint(20) NOT NULL AUTO_INCREMENT;
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
