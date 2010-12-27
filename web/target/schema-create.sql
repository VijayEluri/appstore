
    create table CITY (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        PROVINCE_CODE VARCHAR(255) BINARY not null,
        PROVINCE_NAME VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    create table COMMODITY (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        TYPE VARCHAR(255) BINARY,
        PRICE FLOAT not null,
        SIZE BIGINT not null,
        LANGUAGE VARCHAR(255) BINARY,
        ADDED_TIME DATETIME not null,
        TOTAL_SALE INTEGER not null,
        VERSION VARCHAR(255) BINARY,
        PATH VARCHAR(255) BINARY not null,
        PIC VARCHAR(255) BINARY not null,
        INTRODUCE VARCHAR(255) BINARY,
        IS_FREE TINYINT not null,
        IS_OFF TINYINT not null,
        DEVELOPER VARCHAR(255) BINARY not null,
        TAG VARCHAR(255) BINARY,
        RUN_ENV VARCHAR(255) BINARY not null,
        RESOUCE_FK BIGINT not null,
        COM_FIRST_CATEGORY_FK BIGINT not null,
        COM_SECOND_CATEGORY_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_DEGREE (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        SCORE INTEGER not null,
        DESCRIPTION VARCHAR(255) BINARY,
        primary key (ID)
    ) type=InnoDB;

    create table COM_DOWNLOAD (
        ID BIGINT not null auto_increment,
        DOWN_TIME DATETIME not null,
        PRICE FLOAT,
        CONSUMER_FK BIGINT not null,
        COMMODITY_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_EVALUATION (
        ID BIGINT not null auto_increment,
        CONTENT VARCHAR(255) BINARY not null,
        PUB_TIME DATETIME not null,
        CONSUMER_FK BIGINT not null,
        COMMODITY_FK BIGINT not null,
        COM_DEGREE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_FIRST_CATEGORY (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_ORDER (
        ID BIGINT not null auto_increment,
        ORDER_S_N VARCHAR(255) BINARY not null,
        ORDER_TIME DATETIME not null,
        ORDER_USER_NAME VARCHAR(255) BINARY not null,
        ORDER_ADDRESS VARCHAR(255) BINARY not null,
        ORDER_TEL VARCHAR(255) BINARY not null,
        ORDER_PRICE FLOAT not null,
        SNAPSHOT TEXT,
        CHARGE_TIME DATETIME,
        ORDER_STATE VARCHAR(255) BINARY not null,
        CONSUMER_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_ORDER_ITEM (
        ID BIGINT not null auto_increment,
        COUNT INTEGER not null,
        PRICE FLOAT not null,
        MEMO VARCHAR(255) BINARY,
        COMMODITY_FK BIGINT not null,
        COM_ORDER_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_QUESTION (
        ID BIGINT not null auto_increment,
        QUESTION VARCHAR(255) BINARY not null,
        ANSWER VARCHAR(255) BINARY,
        QUESTION_TIME DATETIME not null,
        ANSWER_TIME DATETIME,
        CONSUMER_FK BIGINT not null,
        PERSON_SERV_PROV_FK BIGINT,
        ENT_SERV_PROV_FK BIGINT,
        COMMODITY_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table COM_SECOND_CATEGORY (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    create table CONSUMER (
        ID BIGINT not null auto_increment,
        USERNAME VARCHAR(255) BINARY not null unique,
        PASSWORD VARCHAR(255) BINARY not null,
        EMAIL VARCHAR(255) BINARY,
        REG_TIME DATETIME not null,
        PHONE VARCHAR(255) BINARY,
        ADDRESS VARCHAR(255) BINARY,
        SEX TINYINT,
        AGE INTEGER,
        SCORE INTEGER,
        CREDIT_TOTAL INTEGER,
        CREDIT_DEGREE_FK BIGINT not null,
        VOCATION_FK BIGINT,
        USER_STATE_FK BIGINT not null,
        CITY_FK BIGINT,
        primary key (ID)
    ) type=InnoDB;

    create table CREDIT_DEGREE (
        ID BIGINT not null auto_increment,
        CRDG_NAME VARCHAR(255) BINARY not null,
        DESCRIPTION VARCHAR(255) BINARY,
        LOW_LEVEL INTEGER not null,
        HIGH_LEVEL INTEGER not null,
        ROLE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table ENT_SERV_PROV (
        ID BIGINT not null auto_increment,
        USERNAME VARCHAR(255) BINARY not null,
        PASSWORD VARCHAR(255) BINARY not null,
        EMAIL VARCHAR(255) BINARY,
        REG_TIME DATETIME not null,
        PHONE VARCHAR(255) BINARY,
        ADDRESS VARCHAR(255) BINARY,
        POST_CODE VARCHAR(255) BINARY,
        ENT_NAME VARCHAR(255) BINARY not null,
        SHORT_NAME VARCHAR(255) BINARY,
        REP_NAME VARCHAR(255) BINARY not null,
        REP_PHONE VARCHAR(255) BINARY,
        REP_CARD_CODE VARCHAR(255) BINARY,
        LICENCE VARCHAR(255) BINARY,
        TAX_CARD VARCHAR(255) BINARY,
        BUSS_CARD VARCHAR(255) BINARY,
        BANK_NAME VARCHAR(255) BINARY,
        BANK_PERSON VARCHAR(255) BINARY,
        ACCOUNT VARCHAR(255) BINARY,
        UP_COUNT INTEGER,
        SUC_COUNT INTEGER,
        CREDIT_TOTAL INTEGER,
        CREDIT_DEGREE_FK BIGINT not null,
        USER_STATE_FK BIGINT not null,
        CITY_FK BIGINT,
        primary key (ID)
    ) type=InnoDB;

    create table FAVORITE (
        ID BIGINT not null auto_increment,
        FAVORITES TEXT,
        CONSUMER_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table PERSON_SERV_PROV (
        ID BIGINT not null auto_increment,
        USERNAME VARCHAR(255) BINARY not null,
        PASSWORD VARCHAR(255) BINARY not null,
        EMAIL VARCHAR(255) BINARY,
        REG_TIME DATETIME not null,
        PHONE VARCHAR(255) BINARY,
        ADDRESS VARCHAR(255) BINARY,
        POST_CODE VARCHAR(255) BINARY,
        CARD_CODE VARCHAR(255) BINARY,
        BANK_NAME VARCHAR(255) BINARY,
        BANK_PERSON VARCHAR(255) BINARY,
        ACCOUNT VARCHAR(255) BINARY,
        UP_COUNT INTEGER,
        SUC_COUNT INTEGER,
        CREDIT_TOTAL INTEGER,
        CREDIT_DEGREE_FK BIGINT not null,
        USER_STATE_FK BIGINT not null,
        CITY_FK BIGINT,
        primary key (ID)
    ) type=InnoDB;

    create table RESOUCE (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        SIZE BIGINT,
        DESCRIPTION VARCHAR(255) BINARY,
        PATH VARCHAR(255) BINARY not null,
        CREATE_TIME DATETIME not null,
        PUBLISH_TIME DATETIME,
        IS_PERSONAL TINYINT not null,
        PRE_PRICE FLOAT,
        PRICE FLOAT,
        IS_FREE TINYINT not null,
        VERSION VARCHAR(255) BINARY,
        DECLARATION VARCHAR(255) BINARY,
        LANGUAGE VARCHAR(255) BINARY,
        DEVELOPER VARCHAR(255) BINARY not null,
        TAG VARCHAR(255) BINARY,
        RUN_ENV VARCHAR(255) BINARY not null,
        PERSON_SERV_PROV_FK BIGINT,
        ENT_SERV_PROV_FK BIGINT,
        COM_FIRST_CATEGORY_FK BIGINT not null,
        COM_SECOND_CATEGORY_FK BIGINT not null,
        RESOUCE_STATE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOUCE_AUDIT (
        ID BIGINT not null auto_increment,
        AUDIT_TIME DATETIME not null,
        SUGGEST VARCHAR(255) BINARY,
        RESULT VARCHAR(255) BINARY not null,
        RESOUCE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOUCE_PICTURE (
        ID BIGINT not null auto_increment,
        URL VARCHAR(255) BINARY not null,
        TITLE VARCHAR(255) BINARY,
        IS_STANDARD TINYINT not null,
        IS_SCREENSHOT TINYINT not null,
        RESOUCE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOUCE_STATE (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOUCE_TEST (
        ID BIGINT not null auto_increment,
        DESCRIPTION VARCHAR(255) BINARY,
        BEGIN_TIME DATETIME,
        END_TIME DATETIME,
        REPORT_U_R_L VARCHAR(255) BINARY,
        REVIEW VARCHAR(255) BINARY,
        MARK INTEGER not null,
        RESULT VARCHAR(255) BINARY not null,
        RESOUCE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table ROLE (
        ID BIGINT not null auto_increment,
        ROLENAME VARCHAR(255) BINARY not null unique,
        primary key (ID)
    ) type=InnoDB;

    create table RUN_ENVIRONMENT (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    create table USER (
        ID BIGINT not null auto_increment,
        USERNAME VARCHAR(255) BINARY not null unique,
        PASSWORD VARCHAR(255) BINARY not null,
        REAL_NAME VARCHAR(255) BINARY,
        EMAIL VARCHAR(255) BINARY,
        PHONE VARCHAR(255) BINARY,
        ADDRESS VARCHAR(255) BINARY,
        DESCRIPTION TEXT,
        PICTURE VARCHAR(255) BINARY,
        QUESTION VARCHAR(255) BINARY,
        ANSWER VARCHAR(255) BINARY,
        POINT DOUBLE not null,
        IS_ACTIVE TINYINT not null,
        REG_TIME DATETIME not null,
        MEMO VARCHAR(255) BINARY,
        ROLE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table USER_STATE (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        DESCRIPTION VARCHAR(255) BINARY,
        primary key (ID)
    ) type=InnoDB;

    create table VOCATION (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    alter table COMMODITY 
        add index COMMODITY_COM_FIRST_CATEGORY_C (COM_FIRST_CATEGORY_FK), 
        add constraint COMMODITY_COM_FIRST_CATEGORY_C 
        foreign key (COM_FIRST_CATEGORY_FK) 
        references COM_FIRST_CATEGORY (ID);

    alter table COMMODITY 
        add index COMMODITY_COM_SECOND_CATEGORYC (COM_SECOND_CATEGORY_FK), 
        add constraint COMMODITY_COM_SECOND_CATEGORYC 
        foreign key (COM_SECOND_CATEGORY_FK) 
        references COM_SECOND_CATEGORY (ID);

    alter table COMMODITY 
        add index COMMODITY_RESOUCE_FKC (RESOUCE_FK), 
        add constraint COMMODITY_RESOUCE_FKC 
        foreign key (RESOUCE_FK) 
        references RESOUCE (ID);

    alter table COM_DOWNLOAD 
        add index COM_DOWNLOAD_COMMODITY_FKC (COMMODITY_FK), 
        add constraint COM_DOWNLOAD_COMMODITY_FKC 
        foreign key (COMMODITY_FK) 
        references COMMODITY (ID);

    alter table COM_DOWNLOAD 
        add index COM_DOWNLOAD_CONSUMER_FKC (CONSUMER_FK), 
        add constraint COM_DOWNLOAD_CONSUMER_FKC 
        foreign key (CONSUMER_FK) 
        references CONSUMER (ID);

    alter table COM_EVALUATION 
        add index COM_EVALUATION_COMMODITY_FKC (COMMODITY_FK), 
        add constraint COM_EVALUATION_COMMODITY_FKC 
        foreign key (COMMODITY_FK) 
        references COMMODITY (ID);

    alter table COM_EVALUATION 
        add index COM_EVALUATION_COM_DEGREE_FKC (COM_DEGREE_FK), 
        add constraint COM_EVALUATION_COM_DEGREE_FKC 
        foreign key (COM_DEGREE_FK) 
        references COM_DEGREE (ID);

    alter table COM_EVALUATION 
        add index COM_EVALUATION_CONSUMER_FKC (CONSUMER_FK), 
        add constraint COM_EVALUATION_CONSUMER_FKC 
        foreign key (CONSUMER_FK) 
        references CONSUMER (ID);

    alter table COM_ORDER 
        add index COM_ORDER_CONSUMER_FKC (CONSUMER_FK), 
        add constraint COM_ORDER_CONSUMER_FKC 
        foreign key (CONSUMER_FK) 
        references CONSUMER (ID);

    alter table COM_ORDER_ITEM 
        add index COM_ORDER_ITEM_COMMODITY_FKC (COMMODITY_FK), 
        add constraint COM_ORDER_ITEM_COMMODITY_FKC 
        foreign key (COMMODITY_FK) 
        references COMMODITY (ID);

    alter table COM_ORDER_ITEM 
        add index COM_ORDER_ITEM_COM_ORDER_FKC (COM_ORDER_FK), 
        add constraint COM_ORDER_ITEM_COM_ORDER_FKC 
        foreign key (COM_ORDER_FK) 
        references COM_ORDER (ID);

    alter table COM_QUESTION 
        add index COM_QUESTION_COMMODITY_FKC (COMMODITY_FK), 
        add constraint COM_QUESTION_COMMODITY_FKC 
        foreign key (COMMODITY_FK) 
        references COMMODITY (ID);

    alter table COM_QUESTION 
        add index COM_QUESTION_ENT_SERV_PROV_FKC (ENT_SERV_PROV_FK), 
        add constraint COM_QUESTION_ENT_SERV_PROV_FKC 
        foreign key (ENT_SERV_PROV_FK) 
        references ENT_SERV_PROV (ID);

    alter table COM_QUESTION 
        add index COM_QUESTION_CONSUMER_FKC (CONSUMER_FK), 
        add constraint COM_QUESTION_CONSUMER_FKC 
        foreign key (CONSUMER_FK) 
        references CONSUMER (ID);

    alter table COM_QUESTION 
        add index COM_QUESTION_PERSON_SERV_PROVC (PERSON_SERV_PROV_FK), 
        add constraint COM_QUESTION_PERSON_SERV_PROVC 
        foreign key (PERSON_SERV_PROV_FK) 
        references PERSON_SERV_PROV (ID);

    alter table CONSUMER 
        add index CONSUMER_CITY_FKC (CITY_FK), 
        add constraint CONSUMER_CITY_FKC 
        foreign key (CITY_FK) 
        references CITY (ID);

    alter table CONSUMER 
        add index CONSUMER_USER_STATE_FKC (USER_STATE_FK), 
        add constraint CONSUMER_USER_STATE_FKC 
        foreign key (USER_STATE_FK) 
        references USER_STATE (ID);

    alter table CONSUMER 
        add index CONSUMER_VOCATION_FKC (VOCATION_FK), 
        add constraint CONSUMER_VOCATION_FKC 
        foreign key (VOCATION_FK) 
        references VOCATION (ID);

    alter table CONSUMER 
        add index CONSUMER_CREDIT_DEGREE_FKC (CREDIT_DEGREE_FK), 
        add constraint CONSUMER_CREDIT_DEGREE_FKC 
        foreign key (CREDIT_DEGREE_FK) 
        references CREDIT_DEGREE (ID);

    alter table CREDIT_DEGREE 
        add index CREDIT_DEGREE_ROLE_FKC (ROLE_FK), 
        add constraint CREDIT_DEGREE_ROLE_FKC 
        foreign key (ROLE_FK) 
        references ROLE (ID);

    alter table ENT_SERV_PROV 
        add index ENT_SERV_PROV_CITY_FKC (CITY_FK), 
        add constraint ENT_SERV_PROV_CITY_FKC 
        foreign key (CITY_FK) 
        references CITY (ID);

    alter table ENT_SERV_PROV 
        add index ENT_SERV_PROV_USER_STATE_FKC (USER_STATE_FK), 
        add constraint ENT_SERV_PROV_USER_STATE_FKC 
        foreign key (USER_STATE_FK) 
        references USER_STATE (ID);

    alter table ENT_SERV_PROV 
        add index ENT_SERV_PROV_CREDIT_DEGREE_FC (CREDIT_DEGREE_FK), 
        add constraint ENT_SERV_PROV_CREDIT_DEGREE_FC 
        foreign key (CREDIT_DEGREE_FK) 
        references CREDIT_DEGREE (ID);

    alter table FAVORITE 
        add index FAVORITE_CONSUMER_FKC (CONSUMER_FK), 
        add constraint FAVORITE_CONSUMER_FKC 
        foreign key (CONSUMER_FK) 
        references CONSUMER (ID);

    alter table PERSON_SERV_PROV 
        add index PERSON_SERV_PROV_CITY_FKC (CITY_FK), 
        add constraint PERSON_SERV_PROV_CITY_FKC 
        foreign key (CITY_FK) 
        references CITY (ID);

    alter table PERSON_SERV_PROV 
        add index PERSON_SERV_PROV_USER_STATE_FC (USER_STATE_FK), 
        add constraint PERSON_SERV_PROV_USER_STATE_FC 
        foreign key (USER_STATE_FK) 
        references USER_STATE (ID);

    alter table PERSON_SERV_PROV 
        add index PERSON_SERV_PROV_CREDIT_DEGREC (CREDIT_DEGREE_FK), 
        add constraint PERSON_SERV_PROV_CREDIT_DEGREC 
        foreign key (CREDIT_DEGREE_FK) 
        references CREDIT_DEGREE (ID);

    alter table RESOUCE 
        add index RESOUCE_COM_FIRST_CATEGORY_FKC (COM_FIRST_CATEGORY_FK), 
        add constraint RESOUCE_COM_FIRST_CATEGORY_FKC 
        foreign key (COM_FIRST_CATEGORY_FK) 
        references COM_FIRST_CATEGORY (ID);

    alter table RESOUCE 
        add index RESOUCE_ENT_SERV_PROV_FKC (ENT_SERV_PROV_FK), 
        add constraint RESOUCE_ENT_SERV_PROV_FKC 
        foreign key (ENT_SERV_PROV_FK) 
        references ENT_SERV_PROV (ID);

    alter table RESOUCE 
        add index RESOUCE_COM_SECOND_CATEGORY_FC (COM_SECOND_CATEGORY_FK), 
        add constraint RESOUCE_COM_SECOND_CATEGORY_FC 
        foreign key (COM_SECOND_CATEGORY_FK) 
        references COM_SECOND_CATEGORY (ID);

    alter table RESOUCE 
        add index RESOUCE_RESOUCE_STATE_FKC (RESOUCE_STATE_FK), 
        add constraint RESOUCE_RESOUCE_STATE_FKC 
        foreign key (RESOUCE_STATE_FK) 
        references RESOUCE_STATE (ID);

    alter table RESOUCE 
        add index RESOUCE_PERSON_SERV_PROV_FKC (PERSON_SERV_PROV_FK), 
        add constraint RESOUCE_PERSON_SERV_PROV_FKC 
        foreign key (PERSON_SERV_PROV_FK) 
        references PERSON_SERV_PROV (ID);

    alter table RESOUCE_AUDIT 
        add index RESOUCE_AUDIT_RESOUCE_FKC (RESOUCE_FK), 
        add constraint RESOUCE_AUDIT_RESOUCE_FKC 
        foreign key (RESOUCE_FK) 
        references RESOUCE (ID);

    alter table RESOUCE_PICTURE 
        add index RESOUCE_PICTURE_RESOUCE_FKC (RESOUCE_FK), 
        add constraint RESOUCE_PICTURE_RESOUCE_FKC 
        foreign key (RESOUCE_FK) 
        references RESOUCE (ID);

    alter table RESOUCE_TEST 
        add index RESOUCE_TEST_RESOUCE_FKC (RESOUCE_FK), 
        add constraint RESOUCE_TEST_RESOUCE_FKC 
        foreign key (RESOUCE_FK) 
        references RESOUCE (ID);

    alter table USER 
        add index USER_ROLE_FKC (ROLE_FK), 
        add constraint USER_ROLE_FKC 
        foreign key (ROLE_FK) 
        references ROLE (ID);
