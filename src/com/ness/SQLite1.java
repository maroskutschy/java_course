package com.ness;

public class SQLite1 {

    //created db:  sqlite3 test.db
    // close sqllite: .quit
    // help: .help
    // create headers of columns: .headers on
    // create table: create table contacts (name text, phone integer, email text);
    // put data: insert into contacts (name, phone, email) values ('Maros', 585858, 'maros@test.com');
    //           insert into contacts values ("John", 4444, "john@test.com");
    // query: SELECT * FROM contacts;
    // backup: .backup testbackup
    // update every record: UPDATE contacts SET email="steve@test.com";
    // restore: .restore testbackup
    // update 1 entry: UPDATE contacts SET email="steve@test.com" WHERE name = "Steve";
    // select 1 row: SELECT * FROM contacts  WHERE email="steve@test.com";
    // select 1 row: SELECT phone, email FROM contacts  WHERE email="steve@test.com";
    // delete: DELETE FROM contacts WHERE phone=321;
    // list of tables: .tables
    // schemas: .schema
    //all commands to create data and tables: .dump
    //  exit sqlite: .exit
    // open existing db: sqlite3 music.db
    // order by ignoring case: select * from albums order by name collate nocase;
    // order by ignoring case descending: select * from albums order by name collate nocase DESC;
    // order by more columns ignoring case: select * from albums order by artist,name collate nocase;
    // join: SELECT songs.track, songs.title, albums.name FROM songs INNER JOIN albums ON songs.album = albums._id;


}
