@echo off
call "%~dp0variables"

@echo 100
DEL %TO9%_100.sql
@echo.
type %SO9%_SEQUENCES.sql                    >>%TO9%_100.sql
type %SO9%_TABLES.sql                       >>%TO9%_100.sql
type %SO9%_PRIMARY_KEYS_RENUMBERED.sql      >>%TO9%_100.sql
type %SO9%_UNIQUE_KEYS_RENUMBERED.sql       >>%TO9%_100.sql
type %SO9%_NON_UNIQUE_KEYS_RENUMBERED.sql   >>%TO9%_100.sql
type %SO9%_CHECKS_RENUMBERED.sql            >>%TO9%_100.sql
type %SO9%_DEFAULTS_RENUMBERED.sql          >>%TO9%_100.sql
type %SO9%_VIEWS.sql                        >>%TO9%_100.sql

@echo 300
DEL %TO9%_300.sql
@echo.
type %SO9%_FOREIGN_KEYS_RENUMBERED.sql      >>%TO9%_300.sql
type %SO9%_SEQUENCES_SET.sql                >>%TO9%_300.sql

@echo 999
DEL %TO9%_999.sql
@echo.
type %SO9%_TABLES_DROP.sql                  >>%TO9%_999.sql
type %SO9%_SEQUENCES_DROP.sql               >>%TO9%_999.sql

@echo DBD
DEL %TO9%_DBD.sql
@echo.
@echo DBD
type %SO9%_TABLES_DROP.sql                  >>%TO9%_DBD.sql
type %SO9%_SEQUENCES_DROP.sql               >>%TO9%_DBD.sql
@echo DBD
type %SO9%_SEQUENCES.sql                    >>%TO9%_DBD.sql
type %SO9%_TABLES.sql                       >>%TO9%_DBD.sql
type %SO9%_PRIMARY_KEYS_RENUMBERED.sql      >>%TO9%_DBD.sql
type %SO9%_UNIQUE_KEYS_RENUMBERED.sql       >>%TO9%_DBD.sql
type %SO9%_NON_UNIQUE_KEYS_RENUMBERED.sql   >>%TO9%_DBD.sql
type %SO9%_CHECKS_RENUMBERED.sql            >>%TO9%_DBD.sql
type %SO9%_DEFAULTS_RENUMBERED.sql          >>%TO9%_DBD.sql
type %SO9%_VIEWS.sql                        >>%TO9%_DBD.sql
@echo 200
type %TO9%_200.sql                          >>%TO9%_DBD.sql
@echo DBD
type %SO9%_FOREIGN_KEYS_RENUMBERED.sql      >>%TO9%_DBD.sql
type %SO9%_SEQUENCES_SET.sql                >>%TO9%_DBD.sql
