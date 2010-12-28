
    alter table COMMODITY 
        drop 
        foreign key COMMODITY_COM_FIRST_CATEGORY_C;

    alter table COMMODITY 
        drop 
        foreign key COMMODITY_COM_SECOND_CATEGORYC;

    alter table COMMODITY 
        drop 
        foreign key COMMODITY_RESOURCE_FKC;

    alter table COM_DOWNLOAD 
        drop 
        foreign key COM_DOWNLOAD_COMMODITY_FKC;

    alter table COM_DOWNLOAD 
        drop 
        foreign key COM_DOWNLOAD_CONSUMER_FKC;

    alter table COM_EVALUATION 
        drop 
        foreign key COM_EVALUATION_COMMODITY_FKC;

    alter table COM_EVALUATION 
        drop 
        foreign key COM_EVALUATION_COM_DEGREE_FKC;

    alter table COM_EVALUATION 
        drop 
        foreign key COM_EVALUATION_CONSUMER_FKC;

    alter table COM_ORDER 
        drop 
        foreign key COM_ORDER_CONSUMER_FKC;

    alter table COM_ORDER_ITEM 
        drop 
        foreign key COM_ORDER_ITEM_COMMODITY_FKC;

    alter table COM_ORDER_ITEM 
        drop 
        foreign key COM_ORDER_ITEM_COM_ORDER_FKC;

    alter table COM_QUESTION 
        drop 
        foreign key COM_QUESTION_COMMODITY_FKC;

    alter table COM_QUESTION 
        drop 
        foreign key COM_QUESTION_ENT_SERV_PROV_FKC;

    alter table COM_QUESTION 
        drop 
        foreign key COM_QUESTION_CONSUMER_FKC;

    alter table COM_QUESTION 
        drop 
        foreign key COM_QUESTION_PERSON_SERV_PROVC;

    alter table COM_SECOND_CATEGORY 
        drop 
        foreign key COM_SECOND_CATEGORY_COM_FIRSTC;

    alter table CONSUMER 
        drop 
        foreign key CONSUMER_CITY_FKC;

    alter table CONSUMER 
        drop 
        foreign key CONSUMER_USER_STATE_FKC;

    alter table CONSUMER 
        drop 
        foreign key CONSUMER_VOCATION_FKC;

    alter table CONSUMER 
        drop 
        foreign key CONSUMER_CREDIT_DEGREE_FKC;

    alter table CREDIT_DEGREE 
        drop 
        foreign key CREDIT_DEGREE_ROLE_FKC;

    alter table ENT_SERV_PROV 
        drop 
        foreign key ENT_SERV_PROV_CITY_FKC;

    alter table ENT_SERV_PROV 
        drop 
        foreign key ENT_SERV_PROV_USER_STATE_FKC;

    alter table ENT_SERV_PROV 
        drop 
        foreign key ENT_SERV_PROV_CREDIT_DEGREE_FC;

    alter table FAVORITE 
        drop 
        foreign key FAVORITE_CONSUMER_FKC;

    alter table PERSON_SERV_PROV 
        drop 
        foreign key PERSON_SERV_PROV_CITY_FKC;

    alter table PERSON_SERV_PROV 
        drop 
        foreign key PERSON_SERV_PROV_USER_STATE_FC;

    alter table PERSON_SERV_PROV 
        drop 
        foreign key PERSON_SERV_PROV_CREDIT_DEGREC;

    alter table RESOURCE 
        drop 
        foreign key RESOURCE_COM_FIRST_CATEGORY_FC;

    alter table RESOURCE 
        drop 
        foreign key RESOURCE_ENT_SERV_PROV_FKC;

    alter table RESOURCE 
        drop 
        foreign key RESOURCE_COM_SECOND_CATEGORY_C;

    alter table RESOURCE 
        drop 
        foreign key RESOURCE_RESOURCE_STATE_FKC;

    alter table RESOURCE 
        drop 
        foreign key RESOURCE_PERSON_SERV_PROV_FKC;

    alter table RESOURCE_AUDIT 
        drop 
        foreign key RESOURCE_AUDIT_RESOURCE_FKC;

    alter table RESOURCE_PICTURE 
        drop 
        foreign key RESOURCE_PICTURE_RESOURCE_FKC;

    alter table RESOURCE_TEST 
        drop 
        foreign key RESOURCE_TEST_RESOURCE_FKC;

    alter table USER 
        drop 
        foreign key USER_ROLE_FKC;

    drop table if exists CITY;

    drop table if exists COMMODITY;

    drop table if exists COM_DEGREE;

    drop table if exists COM_DOWNLOAD;

    drop table if exists COM_EVALUATION;

    drop table if exists COM_FIRST_CATEGORY;

    drop table if exists COM_ORDER;

    drop table if exists COM_ORDER_ITEM;

    drop table if exists COM_QUESTION;

    drop table if exists COM_SECOND_CATEGORY;

    drop table if exists CONSUMER;

    drop table if exists CREDIT_DEGREE;

    drop table if exists ENT_SERV_PROV;

    drop table if exists FAVORITE;

    drop table if exists PERSON_SERV_PROV;

    drop table if exists RESOURCE;

    drop table if exists RESOURCE_AUDIT;

    drop table if exists RESOURCE_PICTURE;

    drop table if exists RESOURCE_STATE;

    drop table if exists RESOURCE_TEST;

    drop table if exists ROLE;

    drop table if exists RUN_ENVIRONMENT;

    drop table if exists USER;

    drop table if exists USER_STATE;

    drop table if exists VOCATION;

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
        RESOURCE_FK BIGINT not null,
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
        COM_FIRST_CATEGORY_FK BIGINT not null,
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

    create table RESOURCE (
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
        RESOURCE_STATE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOURCE_AUDIT (
        ID BIGINT not null auto_increment,
        AUDIT_TIME DATETIME not null,
        SUGGEST VARCHAR(255) BINARY,
        RESULT VARCHAR(255) BINARY not null,
        RESOURCE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOURCE_PICTURE (
        ID BIGINT not null auto_increment,
        URL VARCHAR(255) BINARY not null,
        TITLE VARCHAR(255) BINARY,
        IS_STANDARD TINYINT not null,
        IS_SCREENSHOT TINYINT not null,
        RESOURCE_FK BIGINT not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOURCE_STATE (
        ID BIGINT not null auto_increment,
        NAME VARCHAR(255) BINARY not null,
        CODE VARCHAR(255) BINARY not null,
        primary key (ID)
    ) type=InnoDB;

    create table RESOURCE_TEST (
        ID BIGINT not null auto_increment,
        DESCRIPTION VARCHAR(255) BINARY,
        BEGIN_TIME DATETIME,
        END_TIME DATETIME,
        REPORT_U_R_L VARCHAR(255) BINARY,
        REVIEW VARCHAR(255) BINARY,
        MARK INTEGER not null,
        RESULT VARCHAR(255) BINARY not null,
        RESOURCE_FK BIGINT not null,
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
        add index COMMODITY_RESOURCE_FKC (RESOURCE_FK), 
        add constraint COMMODITY_RESOURCE_FKC 
        foreign key (RESOURCE_FK) 
        references RESOURCE (ID);

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

    alter table COM_SECOND_CATEGORY 
        add index COM_SECOND_CATEGORY_COM_FIRSTC (COM_FIRST_CATEGORY_FK), 
        add constraint COM_SECOND_CATEGORY_COM_FIRSTC 
        foreign key (COM_FIRST_CATEGORY_FK) 
        references COM_FIRST_CATEGORY (ID);

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

    alter table RESOURCE 
        add index RESOURCE_COM_FIRST_CATEGORY_FC (COM_FIRST_CATEGORY_FK), 
        add constraint RESOURCE_COM_FIRST_CATEGORY_FC 
        foreign key (COM_FIRST_CATEGORY_FK) 
        references COM_FIRST_CATEGORY (ID);

    alter table RESOURCE 
        add index RESOURCE_ENT_SERV_PROV_FKC (ENT_SERV_PROV_FK), 
        add constraint RESOURCE_ENT_SERV_PROV_FKC 
        foreign key (ENT_SERV_PROV_FK) 
        references ENT_SERV_PROV (ID);

    alter table RESOURCE 
        add index RESOURCE_COM_SECOND_CATEGORY_C (COM_SECOND_CATEGORY_FK), 
        add constraint RESOURCE_COM_SECOND_CATEGORY_C 
        foreign key (COM_SECOND_CATEGORY_FK) 
        references COM_SECOND_CATEGORY (ID);

    alter table RESOURCE 
        add index RESOURCE_RESOURCE_STATE_FKC (RESOURCE_STATE_FK), 
        add constraint RESOURCE_RESOURCE_STATE_FKC 
        foreign key (RESOURCE_STATE_FK) 
        references RESOURCE_STATE (ID);

    alter table RESOURCE 
        add index RESOURCE_PERSON_SERV_PROV_FKC (PERSON_SERV_PROV_FK), 
        add constraint RESOURCE_PERSON_SERV_PROV_FKC 
        foreign key (PERSON_SERV_PROV_FK) 
        references PERSON_SERV_PROV (ID);

    alter table RESOURCE_AUDIT 
        add index RESOURCE_AUDIT_RESOURCE_FKC (RESOURCE_FK), 
        add constraint RESOURCE_AUDIT_RESOURCE_FKC 
        foreign key (RESOURCE_FK) 
        references RESOURCE (ID);

    alter table RESOURCE_PICTURE 
        add index RESOURCE_PICTURE_RESOURCE_FKC (RESOURCE_FK), 
        add constraint RESOURCE_PICTURE_RESOURCE_FKC 
        foreign key (RESOURCE_FK) 
        references RESOURCE (ID);

    alter table RESOURCE_TEST 
        add index RESOURCE_TEST_RESOURCE_FKC (RESOURCE_FK), 
        add constraint RESOURCE_TEST_RESOURCE_FKC 
        foreign key (RESOURCE_FK) 
        references RESOURCE (ID);

    alter table USER 
        add index USER_ROLE_FKC (ROLE_FK), 
        add constraint USER_ROLE_FKC 
        foreign key (ROLE_FK) 
        references ROLE (ID);
