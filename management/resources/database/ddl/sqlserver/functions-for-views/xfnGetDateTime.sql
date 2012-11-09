if exists (select * from dbo.sysobjects where id = object_id(N'[dbo].[xfnGetDateTime]') and xtype in (N'FN', N'IF', N'TF'))
drop function [dbo].[xfnGetDateTime]
GO
SET QUOTED_IDENTIFIER ON 
GO
SET ANSI_NULLS ON 
GO
create function xfnGetDateTime() returns datetime as
begin
--	EXECUTE sp_serveroption 'DELL-5WXJZF1', 'DATA ACCESS', TRUE
	declare @fecha_hora_ejecucion datetime
	select  @fecha_hora_ejecucion = dt from openquery([DELL-5WXJZF1], 'select dt = getdate()')
	return	@fecha_hora_ejecucion
end
GO
SET QUOTED_IDENTIFIER OFF 
GO
SET ANSI_NULLS ON 
GO
