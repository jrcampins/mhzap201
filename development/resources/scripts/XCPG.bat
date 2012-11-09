@echo off
call "%~dp0variables"

@echo 100
DEL %TPG%_100.sql
@echo.
type %SPG%_SEQUENCES.sql                    >>%TPG%_100.sql
type %SPG%_TABLES.sql                       >>%TPG%_100.sql
type %SPG%_PRIMARY_KEYS_RENUMBERED.sql      >>%TPG%_100.sql
type %SPG%_UNIQUE_KEYS_RENUMBERED.sql       >>%TPG%_100.sql
type %SPG%_NON_UNIQUE_KEYS_RENUMBERED.sql   >>%TPG%_100.sql
type %SPG%_CHECKS_RENUMBERED.sql            >>%TPG%_100.sql
type %SPG%_DEFAULTS_RENUMBERED.sql          >>%TPG%_100.sql
type %SPG%_VIEWS.sql                        >>%TPG%_100.sql

@echo 300
DEL %TPG%_300.sql
@echo.
type %SPG%_FOREIGN_KEYS_RENUMBERED.sql      >>%TPG%_300.sql
type %SPG%_SEQUENCES_SET.sql                >>%TPG%_300.sql

@echo 999
DEL %TPG%_999.sql
@echo.
type %SPG%_TABLES_DROP.sql                  >>%TPG%_999.sql
type %SPG%_SEQUENCES_DROP.sql               >>%TPG%_999.sql

@echo DBD
DEL %TPG%_DBD.sql
@echo.
@echo DBD
type %SPG%_TABLES_DROP.sql                  >>%TPG%_DBD.sql
type %SPG%_SEQUENCES_DROP.sql               >>%TPG%_DBD.sql
@echo DBD
type %SPG%_SEQUENCES.sql                    >>%TPG%_DBD.sql
type %SPG%_TABLES.sql                       >>%TPG%_DBD.sql
type %SPG%_PRIMARY_KEYS_RENUMBERED.sql      >>%TPG%_DBD.sql
type %SPG%_UNIQUE_KEYS_RENUMBERED.sql       >>%TPG%_DBD.sql
type %SPG%_NON_UNIQUE_KEYS_RENUMBERED.sql   >>%TPG%_DBD.sql
type %SPG%_CHECKS_RENUMBERED.sql            >>%TPG%_DBD.sql
type %SPG%_DEFAULTS_RENUMBERED.sql          >>%TPG%_DBD.sql
type %SPG%_VIEWS.sql                        >>%TPG%_DBD.sql
@echo 200
type %TPG%_200.sql                          >>%TPG%_DBD.sql
@echo DBD
type %SPG%_FOREIGN_KEYS_RENUMBERED.sql      >>%TPG%_DBD.sql
type %SPG%_SEQUENCES_SET.sql                >>%TPG%_DBD.sql
