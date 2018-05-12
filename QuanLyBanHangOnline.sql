CREATE TABLE Customer (
  IsVip    int(10) NOT NULL, 
  PersonID varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Person (
  ID         varchar(255) NOT NULL, 
  AccountID  varchar(255) NOT NULL, 
  Name       varchar(255), 
  Identifier varchar(255), 
  BirthDay   date, 
  Gender     int(10) NOT NULL, 
  Email      varchar(255), 
  Number     varchar(255), 
  Address    varchar(255) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE Account (
  ID       varchar(255) NOT NULL, 
  RoleId   int(11) NOT NULL, 
  UserName varchar(255), 
  PassWord varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE ManagingEmployee (
  PossionManaging varchar(255), 
  PersonID        varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE CustomerVip (
  NumberCard varchar(255), 
  Point      float NOT NULL, 
  PersonID   varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE MaketingEmployee (
  PossionMaketing varchar(255), 
  PersonID        varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Book (
  CodeBook       varchar(255), 
  Year           date, 
  NumberPage     int(10) NOT NULL, 
  SizeBook       varchar(255), 
  TypeBook       varchar(255), 
  Description    varchar(255), 
  ItemID         varchar(255) NOT NULL, 
  AuthorPersonID varchar(255) NOT NULL, 
  PublisherID    varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE TechBook (
  ItemID varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE LiteratureBook (
  ItemID varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE Employee (
  SalaryBase       float NOT NULL, 
  Coefficient      float NOT NULL, 
  NumberExperience float NOT NULL, 
  PersonID         varchar(255) NOT NULL, 
  StoreID          varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Publisher (
  ID          varchar(255) NOT NULL, 
  Name        varchar(255), 
  Description varchar(255), 
  Address     varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE CountingEmloyee (
  PossionCounting varchar(255), 
  PersonID        varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Bill (
  ID                     varchar(255) NOT NULL, 
  OrderID                varchar(255) NOT NULL, 
  SellerEmployeePersonID varchar(255) NOT NULL, 
  Amount                 float NOT NULL, 
  `Date`                 date, 
  Payed                  int(10) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE `Order` (
  ID                      varchar(255) NOT NULL, 
  CountingEmloyeePersonID varchar(255) NOT NULL, 
  CartID                  varchar(255) NOT NULL, 
  PaymentID               varchar(255) NOT NULL, 
  ShippingID              varchar(255) NOT NULL, 
  StatusID                varchar(255) NOT NULL, 
  DateOrder               date, 
  DatePayMent             date, 
  DateDelivery            date, 
  StatusOrder             int(10) NOT NULL, 
  AddressOrder            varchar(255) NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE Cart (
  ID               varchar(255) NOT NULL, 
  CustomerPersonID varchar(255) NOT NULL, 
  Amount           float NOT NULL, 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE SellerEmployee (
  BuySuccess int(10) NOT NULL, 
  PersonID   varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Author (
  Qualification varchar(255), 
  PersonID      varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Store (
  ID          varchar(255) NOT NULL, 
  Name        varchar(255), 
  Discription varchar(255), 
  Address     varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE CauGiayStore (
  StoreID varchar(255) NOT NULL, 
  PRIMARY KEY (StoreID)) CHARACTER SET UTF8;
CREATE TABLE HoTungMauStore (
  StoreID varchar(255) NOT NULL, 
  PRIMARY KEY (StoreID)) CHARACTER SET UTF8;
CREATE TABLE Category (
  ID           varchar(255) NOT NULL, 
  CodeCategory varchar(255), 
  NameCategory varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE Item (
  ID                        varchar(255) NOT NULL, 
  WarehouseEmployeePersonID varchar(255) NOT NULL, 
  CategoryID                varchar(255) NOT NULL, 
  Name                      varchar(255), 
  Price                     float NOT NULL, 
  Quantity                  int(10) NOT NULL, 
  ImageSrc                  varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE Electronic (
  ScreenSize       float NOT NULL, 
  Cpu              varchar(255), 
  Room             varchar(255), 
  Ram              varchar(255), 
  Gpu              varchar(255), 
  OperaSystem      varchar(255), 
  CameraFont       varchar(255), 
  SrceenResolation varchar(255), 
  WarrantyPeriod   float NOT NULL, 
  ItemID           varchar(255) NOT NULL, 
  CompanyID        varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE Smartphone (
  Battery     float NOT NULL, 
  CameraAfter varchar(255), 
  ItemID      varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE Tablet (
  Battery     float NOT NULL, 
  CameraAfter varchar(255), 
  ItemID      varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE Laptop (
  IsDVD           int(10) NOT NULL, 
  IsKeyBoardLight int(10) NOT NULL, 
  ItemID          varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE Clothes (
  Name        varchar(255), 
  `Size`      varchar(255), 
  Color       varchar(255), 
  Styles      varchar(255), 
  Description varchar(255), 
  Material    varchar(255), 
  ItemID      varchar(255) NOT NULL, 
  CompanyID   varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE MaleClothes (
  ItemID varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE FemaleClothes (
  ItemID varchar(255) NOT NULL, 
  PRIMARY KEY (ItemID)) CHARACTER SET UTF8;
CREATE TABLE Company (
  ID          varchar(255) NOT NULL, 
  Name        varchar(255), 
  Description varchar(255), 
  Address     varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE Status (
  ID   varchar(255) NOT NULL, 
  Name varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE Shipping (
  ID   varchar(255) NOT NULL, 
  Name varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE ViettelShipping (
  ShippingID varchar(255) NOT NULL, 
  PRIMARY KEY (ShippingID)) CHARACTER SET UTF8;
CREATE TABLE GHNShipping (
  ShippingID varchar(255) NOT NULL, 
  PRIMARY KEY (ShippingID)) CHARACTER SET UTF8;
CREATE TABLE GHTKShipping (
  ShippingID varchar(255) NOT NULL, 
  PRIMARY KEY (ShippingID)) CHARACTER SET UTF8;
CREATE TABLE Payment (
  ID   varchar(255) NOT NULL, 
  Name varchar(255), 
  PRIMARY KEY (ID)) CHARACTER SET UTF8;
CREATE TABLE DirectPayment (
  PaymentID varchar(255) NOT NULL, 
  PRIMARY KEY (PaymentID)) CHARACTER SET UTF8;
CREATE TABLE CreaditCard (
  PaymentID varchar(255) NOT NULL, 
  PRIMARY KEY (PaymentID)) CHARACTER SET UTF8;
CREATE TABLE MasterCard (
  PaymentID varchar(255) NOT NULL, 
  PRIMARY KEY (PaymentID)) CHARACTER SET UTF8;
CREATE TABLE VisaCard (
  PaymentID varchar(255) NOT NULL, 
  PRIMARY KEY (PaymentID)) CHARACTER SET UTF8;
CREATE TABLE ItemDetail (
  Id       varchar(255) NOT NULL, 
  Quantity int(10) NOT NULL, 
  Price    float NOT NULL, 
  ItemID   varchar(255) NOT NULL, 
  CartID   varchar(255) NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
CREATE TABLE WarehouseEmployee (
  PersonID varchar(255) NOT NULL, 
  PRIMARY KEY (PersonID)) CHARACTER SET UTF8;
CREATE TABLE Role (
  Id   int(11) NOT NULL, 
  Name varchar(255) NOT NULL, 
  PRIMARY KEY (Id)) CHARACTER SET UTF8;
ALTER TABLE Customer ADD INDEX FKCustomer220859 (PersonID), ADD CONSTRAINT FKCustomer220859 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE ManagingEmployee ADD INDEX FKManagingEm513004 (PersonID), ADD CONSTRAINT FKManagingEm513004 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE CustomerVip ADD INDEX FKCustomerVi242369 (PersonID), ADD CONSTRAINT FKCustomerVi242369 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE MaketingEmployee ADD INDEX FKMaketingEm317371 (PersonID), ADD CONSTRAINT FKMaketingEm317371 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE Book ADD INDEX FKBook428741 (ItemID), ADD CONSTRAINT FKBook428741 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE TechBook ADD INDEX FKTechBook644773 (ItemID), ADD CONSTRAINT FKTechBook644773 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE LiteratureBook ADD INDEX FKLiterature333915 (ItemID), ADD CONSTRAINT FKLiterature333915 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE Employee ADD INDEX FKEmployee925855 (PersonID), ADD CONSTRAINT FKEmployee925855 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE CountingEmloyee ADD INDEX FKCountingEm644124 (PersonID), ADD CONSTRAINT FKCountingEm644124 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE SellerEmployee ADD INDEX FKSellerEmpl112370 (PersonID), ADD CONSTRAINT FKSellerEmpl112370 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE Author ADD INDEX FKAuthor467143 (PersonID), ADD CONSTRAINT FKAuthor467143 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE CauGiayStore ADD INDEX FKCauGiaySto524635 (StoreID), ADD CONSTRAINT FKCauGiaySto524635 FOREIGN KEY (StoreID) REFERENCES Store (ID);
ALTER TABLE HoTungMauStore ADD INDEX FKHoTungMauS145234 (StoreID), ADD CONSTRAINT FKHoTungMauS145234 FOREIGN KEY (StoreID) REFERENCES Store (ID);
ALTER TABLE Electronic ADD INDEX FKElectronic795880 (ItemID), ADD CONSTRAINT FKElectronic795880 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE Smartphone ADD INDEX FKSmartphone558048 (ItemID), ADD CONSTRAINT FKSmartphone558048 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE Tablet ADD INDEX FKTablet954102 (ItemID), ADD CONSTRAINT FKTablet954102 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE Laptop ADD INDEX FKLaptop345734 (ItemID), ADD CONSTRAINT FKLaptop345734 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE Clothes ADD INDEX FKClothes719930 (ItemID), ADD CONSTRAINT FKClothes719930 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE MaleClothes ADD INDEX FKMaleClothe924244 (ItemID), ADD CONSTRAINT FKMaleClothe924244 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE FemaleClothes ADD INDEX FKFemaleClot714742 (ItemID), ADD CONSTRAINT FKFemaleClot714742 FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE ViettelShipping ADD INDEX FKViettelShi495482 (ShippingID), ADD CONSTRAINT FKViettelShi495482 FOREIGN KEY (ShippingID) REFERENCES Shipping (ID);
ALTER TABLE GHNShipping ADD INDEX FKGHNShippin260196 (ShippingID), ADD CONSTRAINT FKGHNShippin260196 FOREIGN KEY (ShippingID) REFERENCES Shipping (ID);
ALTER TABLE GHTKShipping ADD INDEX FKGHTKShippi930072 (ShippingID), ADD CONSTRAINT FKGHTKShippi930072 FOREIGN KEY (ShippingID) REFERENCES Shipping (ID);
ALTER TABLE DirectPayment ADD INDEX FKDirectPaym796072 (PaymentID), ADD CONSTRAINT FKDirectPaym796072 FOREIGN KEY (PaymentID) REFERENCES Payment (ID);
ALTER TABLE CreaditCard ADD INDEX FKCreaditCar965165 (PaymentID), ADD CONSTRAINT FKCreaditCar965165 FOREIGN KEY (PaymentID) REFERENCES Payment (ID);
ALTER TABLE MasterCard ADD INDEX FKMasterCard751765 (PaymentID), ADD CONSTRAINT FKMasterCard751765 FOREIGN KEY (PaymentID) REFERENCES Payment (ID);
ALTER TABLE VisaCard ADD INDEX FKVisaCard921887 (PaymentID), ADD CONSTRAINT FKVisaCard921887 FOREIGN KEY (PaymentID) REFERENCES Payment (ID);
ALTER TABLE Book ADD INDEX FKBook221643 (PublisherID), ADD CONSTRAINT FKBook221643 FOREIGN KEY (PublisherID) REFERENCES Publisher (ID);
ALTER TABLE Bill ADD INDEX FKBill609075 (SellerEmployeePersonID), ADD CONSTRAINT FKBill609075 FOREIGN KEY (SellerEmployeePersonID) REFERENCES SellerEmployee (PersonID);
ALTER TABLE Book ADD INDEX FKBook950771 (AuthorPersonID), ADD CONSTRAINT FKBook950771 FOREIGN KEY (AuthorPersonID) REFERENCES Author (PersonID);
ALTER TABLE Electronic ADD INDEX FKElectronic621992 (CompanyID), ADD CONSTRAINT FKElectronic621992 FOREIGN KEY (CompanyID) REFERENCES Company (ID);
ALTER TABLE Clothes ADD INDEX FKClothes546042 (CompanyID), ADD CONSTRAINT FKClothes546042 FOREIGN KEY (CompanyID) REFERENCES Company (ID);
ALTER TABLE Item ADD INDEX FKItem525202 (CategoryID), ADD CONSTRAINT FKItem525202 FOREIGN KEY (CategoryID) REFERENCES Category (ID);
ALTER TABLE `Order` ADD INDEX FKOrder822612 (StatusID), ADD CONSTRAINT FKOrder822612 FOREIGN KEY (StatusID) REFERENCES Status (ID);
ALTER TABLE `Order` ADD INDEX FKOrder89587 (ShippingID), ADD CONSTRAINT FKOrder89587 FOREIGN KEY (ShippingID) REFERENCES Shipping (ID);
ALTER TABLE `Order` ADD INDEX FKOrder92191 (PaymentID), ADD CONSTRAINT FKOrder92191 FOREIGN KEY (PaymentID) REFERENCES Payment (ID);
ALTER TABLE Employee ADD INDEX FKEmployee717604 (StoreID), ADD CONSTRAINT FKEmployee717604 FOREIGN KEY (StoreID) REFERENCES Store (ID);
ALTER TABLE Person ADD INDEX FKPerson575894 (AccountID), ADD CONSTRAINT FKPerson575894 FOREIGN KEY (AccountID) REFERENCES Account (ID);
ALTER TABLE Bill ADD INDEX FKBill69969 (OrderID), ADD CONSTRAINT FKBill69969 FOREIGN KEY (OrderID) REFERENCES `Order` (ID);
ALTER TABLE `Order` ADD INDEX FKOrder795597 (CartID), ADD CONSTRAINT FKOrder795597 FOREIGN KEY (CartID) REFERENCES Cart (ID);
ALTER TABLE Cart ADD INDEX FKCart405629 (CustomerPersonID), ADD CONSTRAINT FKCart405629 FOREIGN KEY (CustomerPersonID) REFERENCES Customer (PersonID);
ALTER TABLE ItemDetail ADD INDEX ItemDetail (ItemID), ADD CONSTRAINT ItemDetail FOREIGN KEY (ItemID) REFERENCES Item (ID);
ALTER TABLE ItemDetail ADD INDEX ItemDetail2 (CartID), ADD CONSTRAINT ItemDetail2 FOREIGN KEY (CartID) REFERENCES Cart (ID);
ALTER TABLE WarehouseEmployee ADD INDEX FKWarehouseE832074 (PersonID), ADD CONSTRAINT FKWarehouseE832074 FOREIGN KEY (PersonID) REFERENCES Person (ID);
ALTER TABLE `Order` ADD INDEX FKOrder501438 (CountingEmloyeePersonID), ADD CONSTRAINT FKOrder501438 FOREIGN KEY (CountingEmloyeePersonID) REFERENCES CountingEmloyee (PersonID);
ALTER TABLE Item ADD INDEX FKItem201037 (WarehouseEmployeePersonID), ADD CONSTRAINT FKItem201037 FOREIGN KEY (WarehouseEmployeePersonID) REFERENCES WarehouseEmployee (PersonID);
ALTER TABLE Account ADD INDEX FKAccount660824 (RoleId), ADD CONSTRAINT FKAccount660824 FOREIGN KEY (RoleId) REFERENCES Role (Id);
