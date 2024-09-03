CREATE SEQUENCE public.cliente_id_cliente_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
	CACHE 1
	NO CYCLE;
-- Permissions
ALTER SEQUENCE public.cliente_id_cliente_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE public.cliente_id_cliente_seq TO postgres;
-- public.cliente definition
-- Drop table
-- DROP TABLE public.cliente;
CREATE TABLE public.cliente (
                                id_cliente serial4 NOT NULL,
                                nombre_cliente varchar NULL,
                                proyecto varchar NULL,
                                uuid_cliente uuid NOT NULL,
                                id_proyecto int4 NULL,
                                CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente),
                                CONSTRAINT cliente_uuid_cliente_key UNIQUE (uuid_cliente)
);
-- Permissions
ALTER TABLE public.cliente OWNER TO postgres;
GRANT ALL ON TABLE public.cliente TO postgres;
-- public.entidad_federativa definition
-- Drop table
-- DROP TABLE public.entidad_federativa;
CREATE TABLE public.entidad_federativa (
                                           id_entidad int4 NOT NULL,
                                           nombre_estado varchar NULL,
                                           CONSTRAINT entidadfederativa_pk PRIMARY KEY (id_entidad)
);
-- Permissions
ALTER TABLE public.entidad_federativa OWNER TO postgres;
GRANT ALL ON TABLE public.entidad_federativa TO postgres;
-- public.escenario definition
-- Drop table
-- DROP TABLE public.escenario;
CREATE TABLE public.escenario (
                                  id_escenario int4 NOT NULL,
                                  nombre_escenario varchar NULL,
                                  descripcion_escenario varchar NULL,
                                  tipo_escenario varchar NULL,
                                  uuid_escenario uuid NOT NULL,
                                  CONSTRAINT escenario_pk PRIMARY KEY (id_escenario),
                                  CONSTRAINT escenario_unique UNIQUE (uuid_escenario)
);
-- Permissions
ALTER TABLE public.escenario OWNER TO postgres;
GRANT ALL ON TABLE public.escenario TO postgres;
-- public.proyecto definition
-- Drop table
-- DROP TABLE public.proyecto;
CREATE TABLE public.proyecto (
                                 id_proyecto int4 NOT NULL,
                                 nombreproyecto varchar NOT NULL,
                                 "liderProyecto" varchar NULL,
                                 uud_proyecto uuid NOT NULL,
                                 id_cliente int4 NULL,
                                 CONSTRAINT proyecto_pk PRIMARY KEY (id_proyecto),
                                 CONSTRAINT proyecto_unique UNIQUE (uud_proyecto),
                                 CONSTRAINT proyecto_cliente_fk FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente)
);
-- Permissions
ALTER TABLE public.proyecto OWNER TO postgres;
GRANT ALL ON TABLE public.proyecto TO postgres;
-- public.asignacion definition
-- Drop table
-- DROP TABLE public.asignacion;
CREATE TABLE public.asignacion (
                                   id int4 NOT NULL,
                                   nombre_sitio varchar NOT NULL,
                                   id_enlace varchar NOT NULL,
                                   proyecto varchar NOT NULL,
                                   escenario varchar NULL,
                                   fecha_inicio date NOT NULL,
                                   fecha_asignacion date NULL,
                                   cordinador varchar NULL,
                                   lider varchar NULL,
                                   nomiembros int4 NOT NULL,
                                   estado varchar NULL,
                                   estatus bool NULL,
                                   uuid_asignaciones uuid NOT NULL,
                                   id_proyecto int4 NULL,
                                   id_escenario int4 NULL,
                                   id_estado int4 NULL,
                                   CONSTRAINT asignaciones_pk PRIMARY KEY (id),
                                   CONSTRAINT asignaciones_unique UNIQUE (id_enlace),
                                   CONSTRAINT asignaciones_unique_1 UNIQUE (uuid_asignaciones),
                                   CONSTRAINT asignaciones_entidadfederativa_fk FOREIGN KEY (id_estado) REFERENCES public.entidad_federativa(id_entidad),
                                   CONSTRAINT asignaciones_escenario_fk FOREIGN KEY (id_escenario) REFERENCES public.escenario(id_escenario),
                                   CONSTRAINT asignaciones_proyecto_fk FOREIGN KEY (id_proyecto) REFERENCES public.proyecto(id_proyecto)
);
-- Permissions
ALTER TABLE public.asignacion OWNER TO postgres;
GRANT ALL ON TABLE public.asignacion TO postgres;
-- Permissions
GRANT ALL ON SCHEMA public TO pg_database_owner;
GRANT USAGE ON SCHEMA public TO public;