@echo off
call "%~dp0variables"

@echo 100
DEL %TSS%_100.sql
@echo.
type %BSS%                                  >> %TSS%_100.sql
type %SSS%_TABLES.sql                       >> %TSS%_100.sql
type %SSS%_PRIMARY_KEYS_RENUMBERED.sql      >> %TSS%_100.sql
type %SSS%_UNIQUE_KEYS_RENUMBERED.sql       >> %TSS%_100.sql
type %SSS%_NON_UNIQUE_KEYS_RENUMBERED.sql   >> %TSS%_100.sql
type %SSS%_CHECKS_RENUMBERED.sql            >> %TSS%_100.sql
type %SSS%_DEFAULTS_RENUMBERED.sql          >> %TSS%_100.sql
type %SSS%_VIEWS.sql                        >> %TSS%_100.sql
type %SSS%_COMMENTS.sql                     >> %TSS%_100.sql
type %ESS%                                  >> %TSS%_100.sql

@echo 300
DEL %TSS%_300.sql
@echo.
type %BSS%                                  >> %TSS%_300.sql
type %SSS%_FOREIGN_KEYS_RENUMBERED.sql      >> %TSS%_300.sql
type %SSS%_XLMT.sql                         >> %TSS%_300.sql
type %ESS%                                  >> %TSS%_300.sql

@echo 999
DEL %TSS%_999.sql
@echo.
type %BSS%                                  >> %TSS%_999.sql
type %SSS%_FOREIGN_KEYS_DROP.sql            >> %TSS%_999.sql
type %SSS%_VIEWS_DROP.sql                   >> %TSS%_999.sql
type %SSS%_TABLES_DROP.sql                  >> %TSS%_999.sql
type %ESS%                                  >> %TSS%_999.sql

@echo DBD
DEL %TSS%_DBD.sql
@echo.
type %ESS%                                  >> %TSS%_DBD.sql
@echo 999
type %SSS%_FOREIGN_KEYS_DROP.sql            >> %TSS%_DBD.sql
type %SSS%_VIEWS_DROP.sql                   >> %TSS%_DBD.sql
type %SSS%_TABLES_DROP.sql                  >> %TSS%_DBD.sql
@echo 100
type %SSS%_TABLES.sql                       >> %TSS%_DBD.sql
type %SSS%_PRIMARY_KEYS_RENUMBERED.sql      >> %TSS%_DBD.sql
type %SSS%_UNIQUE_KEYS_RENUMBERED.sql       >> %TSS%_DBD.sql
type %SSS%_NON_UNIQUE_KEYS_RENUMBERED.sql   >> %TSS%_DBD.sql
type %SSS%_CHECKS_RENUMBERED.sql            >> %TSS%_DBD.sql
type %SSS%_DEFAULTS_RENUMBERED.sql          >> %TSS%_DBD.sql
type %SSS%_VIEWS.sql                        >> %TSS%_DBD.sql
type %SSS%_COMMENTS.sql                     >> %TSS%_DBD.sql
@echo 200
type %TSS%_200.sql                          >> %TSS%_DBD.sql
@echo 300
type %SSS%_FOREIGN_KEYS_RENUMBERED.sql      >> %TSS%_DBD.sql
type %SSS%_XLMT.sql                         >> %TSS%_DBD.sql
type %ESS%                                  >> %TSS%_DBD.sql
