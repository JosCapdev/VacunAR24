-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-04-2024 a las 19:07:49
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `vacunar24`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citavacunacion`
--

CREATE TABLE `citavacunacion` (
  `idCitaVacunacion` int(11) NOT NULL,
  `idCiudadano` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `fechaHoraCita` varchar(30) NOT NULL,
  `centroVacunacion` varchar(100) NOT NULL,
  `idVacuna` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `citavacunacion`
--

INSERT INTO `citavacunacion` (`idCitaVacunacion`, `idCiudadano`, `codRefuerzo`, `fechaHoraCita`, `centroVacunacion`, `idVacuna`) VALUES
(133, 3, 2, '2024-04-12T09:30', 'Centro de Resistencia', 13),
(134, 4, 1, '2024-04-12T10:00', 'Centro de La Punta', 13),
(135, 1, 2, '2024-04-12T10:30', 'Centro de ciudad', 13);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudadano`
--

CREATE TABLE `ciudadano` (
  `idCiudadano` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `email` varchar(100) NOT NULL,
  `celular` varchar(20) NOT NULL,
  `patologia` varchar(200) NOT NULL,
  `ambitoLab` varchar(30) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `localidad` varchar(35) NOT NULL,
  `provincia` varchar(30) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ciudadano`
--

INSERT INTO `ciudadano` (`idCiudadano`, `dni`, `nombre`, `apellido`, `email`, `celular`, `patologia`, `ambitoLab`, `domicilio`, `localidad`, `provincia`, `estado`) VALUES
(1, 32345678, 'Jose', 'Capdevila', 'jose@mail', '1234567842', 'No Posee', 'Salud', 'domicEjempl', 'ciudad', 'Mendoza', 1),
(2, 31002343, 'Pablo', 'Gonzalez', 'pabloG@mail', '3324243344', 'No posee', 'Comercio', 'domicilioEJ', 'Carlos Paz', 'Córdoba', 1),
(3, 28938723, 'Carlos', 'Perez', 'carlos@mail', '1144123332', 'No posee', 'Educacion', 'domEjemp', 'Resistencia', 'Chaco', 1),
(4, 420232323, 'Pedro', 'Alonso', 'pedroAlon@mail', '26312323123', 'No Posee', 'Comercio', 'domic.ejemp', 'La Punta', 'San Luis', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `insumos`
--

CREATE TABLE `insumos` (
  `idInsumo` int(11) NOT NULL,
  `idVacuna` int(11) DEFAULT NULL,
  `otros` varchar(500) NOT NULL,
  `centroVacunacion` varchar(300) NOT NULL,
  `alcohol` int(11) NOT NULL,
  `fech` date NOT NULL,
  `enviado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `insumos`
--

INSERT INTO `insumos` (`idInsumo`, `idVacuna`, `otros`, `centroVacunacion`, `alcohol`, `fech`, `enviado`) VALUES
(6, 12, 'guantes,barbijos', 'centro de Ciudad', 5, '2024-04-19', 0),
(7, NULL, 'Guantes y barbijos', 'Centro de Ciudad', 0, '2024-04-19', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `laboratorio`
--

CREATE TABLE `laboratorio` (
  `idLaboratorio` int(11) NOT NULL,
  `cuit` bigint(30) NOT NULL,
  `nombLaboratorio` varchar(80) NOT NULL,
  `pais` varchar(60) NOT NULL,
  `domComercial` varchar(80) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `laboratorio`
--

INSERT INTO `laboratorio` (`idLaboratorio`, `cuit`, `nombLaboratorio`, `pais`, `domComercial`, `estado`) VALUES
(1, 33123232523, 'AztraZeneca', 'ReinoUnido', '34321342', 1),
(2, 30707733701, 'Sputnik', 'Rusia', '123334', 1),
(3, 32232346646, 'Sinopharm', 'China', '1232443', 1),
(4, 332232424, 'Pfizer', 'Reino Unido', '12321332', 1),
(5, 234423, 'sdfsdddd', 'sdfdf', '2334', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notas`
--

CREATE TABLE `notas` (
  `not1` varchar(100) NOT NULL,
  `not2` varchar(500) NOT NULL,
  `not3` varchar(500) NOT NULL,
  `not4` varchar(500) NOT NULL,
  `not5` varchar(500) NOT NULL,
  `not6` varchar(500) NOT NULL,
  `not7` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `notas`
--

INSERT INTO `notas` (`not1`, `not2`, `not3`, `not4`, `not5`, `not6`, `not7`) VALUES
('                                       TITULO DEL AVISO', 'Detalle del envio cod 6, se envio con normalidad', 'Detalle del envio cod 7 se envio con normalidad', 'Se enviaran tecnicos a revisar fallas electricas', '', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesional`
--

CREATE TABLE `profesional` (
  `idProfesional` int(11) NOT NULL,
  `dni` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `email` varchar(100) NOT NULL,
  `celular` varchar(30) NOT NULL,
  `matricula` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `profesional`
--

INSERT INTO `profesional` (`idProfesional`, `dni`, `nombre`, `apellido`, `email`, `celular`, `matricula`, `estado`) VALUES
(1, 23042414, 'Rodolfo', 'Gonzalez', 'rg@mail', '1234532123', 5052, 1),
(2, 33202423, 'Andrea', 'Gimenez', 'andrea@mail', '1234213213', 4035, 1),
(3, 34249223, 'Roberto', 'Viñas', 'roberto@mail', '13123123123', 4579, 1),
(4, 324242224, 'Ezequiel', 'Campos', 'ezcamp@mail', '2331224335', 53435, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registrovacunados`
--

CREATE TABLE `registrovacunados` (
  `idRegistroVacunados` int(11) NOT NULL,
  `idCiudadano` int(11) NOT NULL,
  `codRefuerzo` int(11) NOT NULL,
  `centroVacunacion` varchar(100) NOT NULL,
  `fechaHoraColocada` varchar(100) NOT NULL,
  `idVacuna` int(11) NOT NULL,
  `idProfesional` int(11) NOT NULL,
  `numSerieDosis` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registrovacunados`
--

INSERT INTO `registrovacunados` (`idRegistroVacunados`, `idCiudadano`, `codRefuerzo`, `centroVacunacion`, `fechaHoraColocada`, `idVacuna`, `idProfesional`, `numSerieDosis`) VALUES
(1, 3, 1, 'Centro de Resistencia', '2024-03-27T17:29:50.263', 13, 2, 3232423),
(2, 1, 1, 'Centro de ciudad', '2024-03-27T22:26:14.709', 13, 2, 123321),
(3, 2, 1, 'Centro de Carlos Paz', '2024-03-28T00:22:19.144', 13, 2, 123123),
(4, 3, 1, 'Centro de Resistencia', '2024-03-28T18:57:07.536', 13, 2, 2343234);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reporte`
--

CREATE TABLE `reporte` (
  `idReporte` int(11) NOT NULL,
  `asunto` varchar(100) NOT NULL,
  `descr` varchar(500) NOT NULL,
  `fech` date NOT NULL,
  `revisado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `reporte`
--

INSERT INTO `reporte` (`idReporte`, `asunto`, `descr`, `fech`, `revisado`) VALUES
(4, 'falla electrica', 'no hay luz en una habitacion del consultorio', '2024-04-19', 0),
(6, 'sillas en mal estado', 'Es necesario cambiar sillas del consultorio ', '2024-04-19', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

CREATE TABLE `vacuna` (
  `idVacuna` int(11) NOT NULL,
  `marca` varchar(80) NOT NULL,
  `medida` double NOT NULL,
  `fechaVto` date NOT NULL,
  `colocada` tinyint(1) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `idLaboratorio` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vacuna`
--

INSERT INTO `vacuna` (`idVacuna`, `marca`, `medida`, `fechaVto`, `colocada`, `cantidad`, `idLaboratorio`, `estado`) VALUES
(12, 'AztraZeneca', 2.5, '2025-03-13', 0, 2300, 1, 1),
(13, 'Sputnik V', 2.5, '2025-05-14', 0, 3000, 2, 1),
(14, 'Sinopharm ', 2.5, '2025-03-20', 0, 2900, 3, 1),
(15, 'Pfizer ', 2.5, '2025-03-12', 0, 3000, 4, 1),
(16, 'Sinopharm ', 2.5, '2025-03-19', 0, 3000, 3, 1),
(17, 'jaja', 3.44, '2024-04-12', 0, 2220, 1, 0),
(18, 'Pfizer ', 2.55, '2024-04-18', 0, 2220, 4, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD PRIMARY KEY (`idCitaVacunacion`),
  ADD KEY `idCiudadano` (`idCiudadano`),
  ADD KEY `idVacuna` (`idVacuna`);

--
-- Indices de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  ADD PRIMARY KEY (`idCiudadano`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `insumos`
--
ALTER TABLE `insumos`
  ADD PRIMARY KEY (`idInsumo`),
  ADD KEY `idVacuna` (`idVacuna`);

--
-- Indices de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`idLaboratorio`),
  ADD UNIQUE KEY `cuit` (`cuit`);

--
-- Indices de la tabla `profesional`
--
ALTER TABLE `profesional`
  ADD PRIMARY KEY (`idProfesional`),
  ADD UNIQUE KEY `dni` (`dni`);

--
-- Indices de la tabla `registrovacunados`
--
ALTER TABLE `registrovacunados`
  ADD PRIMARY KEY (`idRegistroVacunados`),
  ADD KEY `idCiudadano` (`idCiudadano`),
  ADD KEY `idVacuna` (`idVacuna`),
  ADD KEY `idProfesional` (`idProfesional`);

--
-- Indices de la tabla `reporte`
--
ALTER TABLE `reporte`
  ADD PRIMARY KEY (`idReporte`);

--
-- Indices de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD PRIMARY KEY (`idVacuna`),
  ADD KEY `idLaboratorio` (`idLaboratorio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  MODIFY `idCitaVacunacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=136;

--
-- AUTO_INCREMENT de la tabla `ciudadano`
--
ALTER TABLE `ciudadano`
  MODIFY `idCiudadano` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `insumos`
--
ALTER TABLE `insumos`
  MODIFY `idInsumo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `laboratorio`
--
ALTER TABLE `laboratorio`
  MODIFY `idLaboratorio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `profesional`
--
ALTER TABLE `profesional`
  MODIFY `idProfesional` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `registrovacunados`
--
ALTER TABLE `registrovacunados`
  MODIFY `idRegistroVacunados` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `reporte`
--
ALTER TABLE `reporte`
  MODIFY `idReporte` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `vacuna`
--
ALTER TABLE `vacuna`
  MODIFY `idVacuna` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `citavacunacion`
--
ALTER TABLE `citavacunacion`
  ADD CONSTRAINT `citavacunacion_ibfk_1` FOREIGN KEY (`idCiudadano`) REFERENCES `ciudadano` (`idCiudadano`),
  ADD CONSTRAINT `citavacunacion_ibfk_2` FOREIGN KEY (`idVacuna`) REFERENCES `vacuna` (`idVacuna`);

--
-- Filtros para la tabla `insumos`
--
ALTER TABLE `insumos`
  ADD CONSTRAINT `insumos_ibfk_1` FOREIGN KEY (`idVacuna`) REFERENCES `vacuna` (`idVacuna`);

--
-- Filtros para la tabla `registrovacunados`
--
ALTER TABLE `registrovacunados`
  ADD CONSTRAINT `registrovacunados_ibfk_1` FOREIGN KEY (`idCiudadano`) REFERENCES `ciudadano` (`idCiudadano`),
  ADD CONSTRAINT `registrovacunados_ibfk_2` FOREIGN KEY (`idVacuna`) REFERENCES `vacuna` (`idVacuna`),
  ADD CONSTRAINT `registrovacunados_ibfk_3` FOREIGN KEY (`idProfesional`) REFERENCES `profesional` (`idProfesional`);

--
-- Filtros para la tabla `vacuna`
--
ALTER TABLE `vacuna`
  ADD CONSTRAINT `vacuna_ibfk_1` FOREIGN KEY (`idLaboratorio`) REFERENCES `laboratorio` (`idLaboratorio`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
