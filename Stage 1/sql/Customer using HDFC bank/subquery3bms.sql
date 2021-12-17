select distinct(USERS.NAME),USERS.ADDRESS from USERS INNER JOIN BOOKINGDETAILS on USERS.USER_ID=BOOKINGDETAILS.USER_ID WHERE USERS.USER_ID not in (select USER_ID from BOOKINGDETAILS where name='HDFC') ORDER BY USERS.name ASC;