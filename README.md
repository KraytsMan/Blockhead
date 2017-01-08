# Blockhead
Game

## Installation steps

### Add external library www.wordsapi:

    wget http://files1.restunited.com/libraries/www_wordsapi_com_022946/beta/0/1/0/sw/WordsAPI-beta-0.1.0-java.tar.gz
    tar mzxvf WordsAPI-beta-0.1.0-java.tar.gz
    cd WordsAPI-java
    gradle install

Add configuration to build.gradle:
    
    dependencies {
        compile 'com.wordsapi.www:words-api:0.1.0'
    }
    
    repositories {
        mavenLocal()
    }

### Run ElasticSearch with docker using command:

    docker run --rm -ti -p 9200:9200 -p 9300:9300 -v /path/to/storage/directory:/usr/share/elasticsearch/data elasticsearch:2.4

### Run Mysql with docker using command:

    docker run --rm -ti -p 3307:3306 -e MYSQL_ROOT_PASSWORD=root -e  MYSQL_DATABASE=blockhead -e  MYSQL_USER=kraytsman -e MYSQL_PASSWORD=1111 -v /path/to/storage/directory:/var/lib/mysql mysql:5.7 --character-set-server=utf8mb4 --collation-server=utf8mb4_unicode_ci

