
    alter table COMMODITY 
        drop 
        foreign key COMMODITY_COM_FIRST_CATEGORY_C;

    alter table COMMODITY 
        drop 
        foreign key COMMODITY_COM_SECOND_CATEGORYC;

    alter table COMMODITY 
        drop 
        foreign key COMMODITY_RESOUCE_FKC;

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

    alter table RESOUCE 
        drop 
        foreign key RESOUCE_COM_FIRST_CATEGORY_FKC;

    alter table RESOUCE 
        drop 
        foreign key RESOUCE_ENT_SERV_PROV_FKC;

    alter table RESOUCE 
        drop 
        foreign key RESOUCE_COM_SECOND_CATEGORY_FC;

    alter table RESOUCE 
        drop 
        foreign key RESOUCE_RESOUCE_STATE_FKC;

    alter table RESOUCE 
        drop 
        foreign key RESOUCE_PERSON_SERV_PROV_FKC;

    alter table RESOUCE_AUDIT 
        drop 
        foreign key RESOUCE_AUDIT_RESOUCE_FKC;

    alter table RESOUCE_PICTURE 
        drop 
        foreign key RESOUCE_PICTURE_RESOUCE_FKC;

    alter table RESOUCE_TEST 
        drop 
        foreign key RESOUCE_TEST_RESOUCE_FKC;

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

    drop table if exists RESOUCE;

    drop table if exists RESOUCE_AUDIT;

    drop table if exists RESOUCE_PICTURE;

    drop table if exists RESOUCE_STATE;

    drop table if exists RESOUCE_TEST;

    drop table if exists ROLE;

    drop table if exists RUN_ENVIRONMENT;

    drop table if exists USER;

    drop table if exists USER_STATE;

    drop table if exists VOCATION;
