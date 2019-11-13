create view USER_TAGS AS
(
select u.AccountID, t.itemdesc
from tags t, taguser u
where t.AccountNum = u.AccountID
);
create view USER_ACCOUNT_INFO AS
(
select u.Fname, u.Lname, u.Minit, u.Streename,
u.City, u.zipode, u.phone, u.extension, u.Accounting
from TAGUSER u
);

create view ACCOUNTS AS
(
select a.AcID, a.Username, a.Password
from ACCOUNT a
);

