create table USER_TAGS
  (

  );

alter table TAGS add foreign key(AccountNum) references Account(AcID);
alter table TAGUSER add foreign key(AccountID) references Account(AcID);

create view USER_TAGS AS
  (
    select u.AccountID, t.itemdesc
    from tags t, taguser u
    where t.AccountNum = u.AccountID
  );
create view USER_ACCOUNT_INFO AS
  (
    select u.Fname, u.Lname, u.Minit, u.Streetname,
    u.City, u.zipCode, u.phone, u.extension, u.AccounNum
    from TAGUSER u
  );

create view ACCOUNTS AS
  (
    select a.AcID, a.Username, a.Password
    from ACCOUNT a
  );
