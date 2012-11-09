DECLARE @SQLDYN1 VARCHAR(8000)
SELECT  @SQLDYN1 = 'DROP DATABASE [MHZDB201]'

DECLARE @SQLDYN2 VARCHAR(8000)
SELECT  @SQLDYN2 = 'CREATE DATABASE [MHZDB201]'
SELECT  @SQLDYN2 = @SQLDYN2 + 'ON(NAME = ''MHZDB201_dat'', '
SELECT  @SQLDYN2 = @SQLDYN2 + 'FILENAME = ''' + @datdir + '\MHZDB201.mdf'','
SELECT  @SQLDYN2 = @SQLDYN2 + 'SIZE = 20, FILEGROWTH = 10%)'
SELECT  @SQLDYN2 = @SQLDYN2 + 'LOG ON(NAME = ''MHZDB201_log'','
SELECT  @SQLDYN2 = @SQLDYN2 + 'FILENAME = ''' + @datdir + '\MHZDB201.ldf'','
SELECT  @SQLDYN2 = @SQLDYN2 + 'SIZE =  5, FILEGROWTH = 20%)'
SELECT  @SQLDYN2 = @SQLDYN2 + 'COLLATE Modern_Spanish_CI_AS'

IF EXISTS (SELECT name FROM master.dbo.sysdatabases WHERE name = N'MHZDB201')
	BEGIN
	PRINT @SQLDYN1
	EXEC (@SQLDYN1)
	END

PRINT @SQLDYN2
EXEC (@SQLDYN2)
GO

exec sp_dboption N'MHZDB201', N'autoclose', N'true'
GO

exec sp_dboption N'MHZDB201', N'bulkcopy', N'false'
GO

exec sp_dboption N'MHZDB201', N'trunc. log', N'true'
GO

exec sp_dboption N'MHZDB201', N'torn page detection', N'true'
GO

exec sp_dboption N'MHZDB201', N'read only', N'false'
GO

exec sp_dboption N'MHZDB201', N'dbo use', N'false'
GO

exec sp_dboption N'MHZDB201', N'single', N'false'
GO

exec sp_dboption N'MHZDB201', N'autoshrink', N'true'
GO

exec sp_dboption N'MHZDB201', N'ANSI null default', N'false'
GO

exec sp_dboption N'MHZDB201', N'recursive triggers', N'false'
GO

exec sp_dboption N'MHZDB201', N'ANSI nulls', N'false'
GO

exec sp_dboption N'MHZDB201', N'concat null yields null', N'false'
GO

exec sp_dboption N'MHZDB201', N'cursor close on commit', N'false'
GO

exec sp_dboption N'MHZDB201', N'default to local cursor', N'false'
GO

exec sp_dboption N'MHZDB201', N'quoted identifier', N'false'
GO

exec sp_dboption N'MHZDB201', N'ANSI warnings', N'false'
GO

exec sp_dboption N'MHZDB201', N'auto create statistics', N'true'
GO

exec sp_dboption N'MHZDB201', N'auto update statistics', N'true'
GO

if( ( (@@microsoftversion / power(2, 24) = 8) and (@@microsoftversion & 0xffff >= 724) ) or ( (@@microsoftversion / power(2, 24) = 7) and (@@microsoftversion & 0xffff >= 1082) ) )
	exec sp_dboption N'MHZDB201', N'db chaining', N'false'
GO
