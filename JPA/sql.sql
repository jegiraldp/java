| pizza | CREATE TABLE `pizza` (
  `id` int NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `price` decimal(5,2) DEFAULT NULL,
  `available` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci

 customer | CREATE TABLE `customer` (
  `id` varchar(15) NOT NULL,
  `name` varchar(60) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phoneNumber` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci 

 pizzaorder | CREATE TABLE `pizzaorder` (
  `id` int NOT NULL,
  `id_customer` varchar(15) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `total` decimal(65,2) DEFAULT NULL,
  `method` char(1) DEFAULT NULL,
  `description` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_customer` (`id_customer`),
  CONSTRAINT `pizzaorder_ibfk_1` FOREIGN KEY (`id_customer`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci 

orderitem | CREATE TABLE `orderitem` (
  `id` int NOT NULL,
  `id_order` int DEFAULT NULL,
  `id_pizza` int DEFAULT NULL,
  `quantity` decimal(2,1) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_order` (`id_order`),
  KEY `id_pizza` (`id_pizza`),
  CONSTRAINT `orderitem_ibfk_1` FOREIGN KEY (`id_order`) REFERENCES `pizzaorder` (`id`),
  CONSTRAINT `orderitem_ibfk_2` FOREIGN KEY (`id_pizza`) REFERENCES `pizza` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci 