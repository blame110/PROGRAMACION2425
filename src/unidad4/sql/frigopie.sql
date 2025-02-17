-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema frigopie
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `frigopie` ;

-- -----------------------------------------------------
-- Schema frigopie
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `frigopie` DEFAULT CHARACTER SET utf8 ;
USE `frigopie` ;

-- -----------------------------------------------------
-- Table `frigopie`.`helado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`helado` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`helado` (
  `idhelado` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  `logo` VARCHAR(255) NOT NULL,
  `precio` DECIMAL(2) NOT NULL,
  `tipo` VARCHAR(45) NULL,
  PRIMARY KEY (`idhelado`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `frigopie`.`empleados`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`empleados` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`empleados` (
  `idempleados` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NULL,
  `apellidos` VARCHAR(100) NULL,
  `edad` INT NULL,
  `sueldo` DECIMAL(5) NULL,
  `puesto` VARCHAR(45) NULL,
  PRIMARY KEY (`idempleados`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `frigopie`.`direccion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`direccion` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`direccion` (
  `iddireccion` INT NOT NULL AUTO_INCREMENT,
  `calle` VARCHAR(45) NULL,
  `numero` VARCHAR(45) NULL,
  `piso` VARCHAR(45) NULL,
  `puerta` VARCHAR(45) NULL,
  `ciudad` VARCHAR(45) NULL,
  `provincia` VARCHAR(45) NULL,
  `pais` VARCHAR(45) NULL,
  PRIMARY KEY (`iddireccion`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `frigopie`.`clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`clientes` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`clientes` (
  `idclientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `direccion` VARCHAR(100) NULL,
  `edad` INT NULL,
  `direccion_iddireccion` INT NOT NULL,
  PRIMARY KEY (`idclientes`, `direccion_iddireccion`),
  CONSTRAINT `fk_clientes_direccion1`
    FOREIGN KEY (`direccion_iddireccion`)
    REFERENCES `frigopie`.`direccion` (`iddireccion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `frigopie`.`tienda`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`tienda` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`tienda` (
  `idtienda` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `tamaño` INT NULL,
  `terraza` TINYINT NULL,
  `fechaApertura` DATE NULL,
  PRIMARY KEY (`idtienda`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `frigopie`.`ingredientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`ingredientes` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`ingredientes` (
  `idingredientes` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NULL,
  `calorias` INT NULL,
  `precio` INT NULL,
  `alergenos` VARCHAR(100) NULL,
  PRIMARY KEY (`idingredientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `frigopie`.`ingredientes_has_helado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`ingredientes_has_helado` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`ingredientes_has_helado` (
  `ingredientes_idingredientes` INT NOT NULL,
  `helado_idhelado` INT NOT NULL,
  `cantidad` INT NULL,
  PRIMARY KEY (`ingredientes_idingredientes`, `helado_idhelado`),
  CONSTRAINT `fk_ingredientes_has_helado_ingredientes`
    FOREIGN KEY (`ingredientes_idingredientes`)
    REFERENCES `frigopie`.`ingredientes` (`idingredientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ingredientes_has_helado_helado1`
    FOREIGN KEY (`helado_idhelado`)
    REFERENCES `frigopie`.`helado` (`idhelado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `frigopie`.`pedidos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`pedidos` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`pedidos` (
  `iPedido` INT NOT NULL,
  `fecha` DATETIME NULL,
  `clientes_idclientes` INT NOT NULL,
  `empleados_idempleados` INT NOT NULL,
  PRIMARY KEY (`iPedido`, `clientes_idclientes`),
  CONSTRAINT `fk_pedidos_clientes1`
    FOREIGN KEY (`clientes_idclientes`)
    REFERENCES `frigopie`.`clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_empleados1`
    FOREIGN KEY (`empleados_idempleados`)
    REFERENCES `frigopie`.`empleados` (`idempleados`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `frigopie`.`pedidos_has_helado`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`pedidos_has_helado` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`pedidos_has_helado` (
  `pedidos_iPedido` INT NOT NULL,
  `helado_idhelado` INT NOT NULL,
  `cantidad` INT NULL,
  PRIMARY KEY (`pedidos_iPedido`, `helado_idhelado`),
  CONSTRAINT `fk_pedidos_has_helado_pedidos1`
    FOREIGN KEY (`pedidos_iPedido`)
    REFERENCES `frigopie`.`pedidos` (`iPedido`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_pedidos_has_helado_helado1`
    FOREIGN KEY (`helado_idhelado`)
    REFERENCES `frigopie`.`helado` (`idhelado`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;



-- -----------------------------------------------------
-- Table `frigopie`.`empleados_has_tienda`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `frigopie`.`empleados_has_tienda` ;

CREATE TABLE IF NOT EXISTS `frigopie`.`empleados_has_tienda` (
  `empleados_idempleados` INT NOT NULL,
  `tienda_idtienda` INT NOT NULL,
  PRIMARY KEY (`empleados_idempleados`, `tienda_idtienda`),
  CONSTRAINT `fk_empleados_has_tienda_empleados1`
    FOREIGN KEY (`empleados_idempleados`)
    REFERENCES `frigopie`.`empleados` (`idempleados`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_empleados_has_tienda_tienda1`
    FOREIGN KEY (`tienda_idtienda`)
    REFERENCES `frigopie`.`tienda` (`idtienda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
