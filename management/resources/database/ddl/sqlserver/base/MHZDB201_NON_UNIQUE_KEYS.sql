CREATE INDEX IX_dominio_parametro_001___ ON dominio_parametro (id_dominio, id_parametro) ON [PRIMARY]
GO
CREATE INDEX IX_persona_anotada_001___ ON persona_anotada (id_persona) ON [PRIMARY]
GO
CREATE INDEX IX_persona_anotada_002___ ON persona_anotada (codigo_persona) ON [PRIMARY]
GO
CREATE INDEX IX_persona_anotada_003___ ON persona_anotada (nombre_persona) ON [PRIMARY]
GO
CREATE INDEX IX_persona_anotada_004___ ON persona_anotada (id_usuario) ON [PRIMARY]
GO
CREATE INDEX IX_persona_anotada_005___ ON persona_anotada (codigo_usuario) ON [PRIMARY]
GO
