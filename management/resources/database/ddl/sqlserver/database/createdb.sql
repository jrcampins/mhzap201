DECLARE @SQLDYNST VARCHAR(8000)
SELECT  @SQLDYNST = 'CREATE DATABASE [MHZDB201]'
SELECT  @SQLDYNST = @SQLDYNST + 'ON(NAME = ''MHZDB201_dat'', '
SELECT  @SQLDYNST = @SQLDYNST + 'FILENAME = ''' + @datdir + '\MHZDB201.mdf'','
SELECT  @SQLDYNST = @SQLDYNST + 'SIZE = 20, FILEGROWTH = 10%)'
SELECT  @SQLDYNST = @SQLDYNST + 'LOG ON(NAME = ''MHZDB201_log'','
SELECT  @SQLDYNST = @SQLDYNST + 'FILENAME = ''' + @datdir + '\MHZDB201.ldf'','
SELECT  @SQLDYNST = @SQLDYNST + 'SIZE =  5, FILEGROWTH = 20%)'
SELECT  @SQLDYNST = @SQLDYNST + 'COLLATE Modern_Spanish_CI_AS'
PRINT	@SQLDYNST
EXEC   (@SQLDYNST)
go
exec sp_dboption N'MHZDB201', N'autoclose', N'true'
go
exec sp_dboption N'MHZDB201', N'bulkcopy', N'false'
go
exec sp_dboption N'MHZDB201', N'trunc. log', N'true'
go
exec sp_dboption N'MHZDB201', N'torn page detection', N'true'
go
exec sp_dboption N'MHZDB201', N'read only', N'false'
go
exec sp_dboption N'MHZDB201', N'dbo use', N'false'
go
exec sp_dboption N'MHZDB201', N'single', N'false'
go
exec sp_dboption N'MHZDB201', N'autoshrink', N'true'
go
exec sp_dboption N'MHZDB201', N'ANSI null default', N'false'
go
exec sp_dboption N'MHZDB201', N'recursive triggers', N'false'
go
exec sp_dboption N'MHZDB201', N'ANSI nulls', N'false'
go
exec sp_dboption N'MHZDB201', N'concat null yields null', N'false'
go
exec sp_dboption N'MHZDB201', N'cursor close on commit', N'false'
go
exec sp_dboption N'MHZDB201', N'default to local cursor', N'false'
go
exec sp_dboption N'MHZDB201', N'quoted identifier', N'false'
go
exec sp_dboption N'MHZDB201', N'ANSI warnings', N'false'
go
exec sp_dboption N'MHZDB201', N'auto create statistics', N'true'
go
exec sp_dboption N'MHZDB201', N'auto update statistics', N'true'
go
if(((@@microsoftversion / power(2, 24) = 8) and (@@microsoftversion & 0xffff >= 724 ))
or ((@@microsoftversion / power(2, 24) = 7) and (@@microsoftversion & 0xffff >= 1082)))
    exec sp_dboption N'MHZDB201', N'db chaining', N'false'
go
