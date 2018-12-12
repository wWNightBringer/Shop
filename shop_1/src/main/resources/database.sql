CREATE DATABASE IF NOT EXISTS `shop_store`;
CREATE TABLE IF NOT EXISTS shop_store.product (
  ID              INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Title`         VARCHAR(100) NOT NULL,
  `Incoming_date` DATE         NOT NULL,
  `Serial_number` VARCHAR(50)  NOT NULL,
  `Shop_Id`       INT          NOT NULL,
  `Count`         INT          NOT NULL,
  `Condition`     VARCHAR(50)  NOT NULL,
  FOREIGN KEY (`Shop_id`) REFERENCES shop (ID_Shop)
)
  ENGINE = InnoDB;
CREATE TABLE IF NOT EXISTS shop_store.shop (
  ID_Shop   INT          NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `Title`   VARCHAR(100) NOT NULL,
  `Shop`    VARCHAR(50)  NOT NULL,
  `Address` VARCHAR(50)  NOT NULL
)