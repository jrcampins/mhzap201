DECLARE @SQLDYNST VARCHAR(8000)
SELECT  @SQLDYNST = 'DROP DATABASE [MHZDB201]'
IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'MHZDB201')
    BEGIN
    PRINT @SQLDYNST
    EXEC (@SQLDYNST)
    END
go