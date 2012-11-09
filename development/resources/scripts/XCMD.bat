@echo off
call "%~dp0variables"

@echo 100
DEL %TMD%_100.sql
@echo.
type %BMD%                                  >> %TMD%_100.sql
type %SMD%_TABLES.sql                       >> %TMD%_100.sql
type %SMD%_PRIMARY_KEYS_RENUMBERED.sql      >> %TMD%_100.sql
type %SMD%_UNIQUE_KEYS_RENUMBERED.sql       >> %TMD%_100.sql
type %SMD%_NON_UNIQUE_KEYS_RENUMBERED.sql   >> %TMD%_100.sql
type %SMD%_CHECKS_RENUMBERED.sql            >> %TMD%_100.sql
type %SMD%_DEFAULTS_RENUMBERED.sql          >> %TMD%_100.sql
type %SMD%_VIEWS.sql                        >> %TMD%_100.sql
type %SMD%_COMMENTS.sql                     >> %TMD%_100.sql
type %EMD%                                  >> %TMD%_100.sql

@echo 300
DEL %TMD%_300.sql
@echo.
type %BMD%                                  >> %TMD%_300.sql
type %SMD%_FOREIGN_KEYS_RENUMBERED.sql      >> %TMD%_300.sql
type %SMD%_XLMT.sql                         >> %TMD%_300.sql
type %EMD%                                  >> %TMD%_300.sql

@echo 999
DEL %TMD%_999.sql
@echo.
type %BMD%                                  >> %TMD%_999.sql
type %SMD%_FOREIGN_KEYS_DROP.sql            >> %TMD%_999.sql
type %SMD%_VIEWS_DROP.sql                   >> %TMD%_999.sql
type %SMD%_TABLES_DROP.sql                  >> %TMD%_999.sql
type %EMD%                                  >> %TMD%_999.sql

@echo DBD
DEL %TMD%_DBD.sql
@echo.
type %EMD%                                  >> %TMD%_DBD.sql
@echo 999
type %SMD%_FOREIGN_KEYS_DROP.sql            >> %TMD%_DBD.sql
type %SMD%_VIEWS_DROP.sql                   >> %TMD%_DBD.sql
type %SMD%_TABLES_DROP.sql                  >> %TMD%_DBD.sql
@echo 100
type %SMD%_TABLES.sql                       >> %TMD%_DBD.sql
type %SMD%_PRIMARY_KEYS_RENUMBERED.sql      >> %TMD%_DBD.sql
type %SMD%_UNIQUE_KEYS_RENUMBERED.sql       >> %TMD%_DBD.sql
type %SMD%_NON_UNIQUE_KEYS_RENUMBERED.sql   >> %TMD%_DBD.sql
type %SMD%_CHECKS_RENUMBERED.sql            >> %TMD%_DBD.sql
type %SMD%_DEFAULTS_RENUMBERED.sql          >> %TMD%_DBD.sql
type %SMD%_VIEWS.sql                        >> %TMD%_DBD.sql
type %SMD%_COMMENTS.sql                     >> %TMD%_DBD.sql
@echo 200
type %TMD%_200.sql                          >> %TMD%_DBD.sql
@echo 300
type %SMD%_FOREIGN_KEYS_RENUMBERED.sql      >> %TMD%_DBD.sql
type %SMD%_XLMT.sql                         >> %TMD%_DBD.sql
type %EMD%                                  >> %TMD%_DBD.sql
