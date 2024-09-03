
-- Secuencia para id_cliente en la tabla cliente
CREATE SEQUENCE public.cliente_id_cliente_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
    CACHE 1
    NO CYCLE;

-- Tabla cliente
CREATE TABLE public.cliente (
                                id_cliente INT NOT NULL DEFAULT nextval('public.cliente_id_cliente_seq'),
                                nombre_cliente VARCHAR NULL,
                                proyecto VARCHAR NULL,
                                uuid_cliente UUID NOT NULL,
                                id_proyecto INT NULL,
                                CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente),
                                CONSTRAINT cliente_uuid_cliente_key UNIQUE (uuid_cliente)
);

-- Secuencia para id_entidad en la tabla entidad_federativa
CREATE SEQUENCE public.entidad_federativa_id_entidad_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
    CACHE 1
    NO CYCLE;

-- Tabla entidad_federativa
CREATE TABLE public.entidad_federativa (
                                           id_entidad INT NOT NULL DEFAULT nextval('public.entidad_federativa_id_entidad_seq'),
                                           nombre_estado VARCHAR NULL,
                                           CONSTRAINT entidadfederativa_pk PRIMARY KEY (id_entidad)
);

-- Secuencia para id_escenario en la tabla escenario
CREATE SEQUENCE public.escenario_id_escenario_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
    CACHE 1
    NO CYCLE;

-- Tabla escenario
CREATE TABLE public.escenario (
                                  id_escenario INT NOT NULL DEFAULT nextval('public.escenario_id_escenario_seq'),
                                  nombre_escenario VARCHAR NULL,
                                  descripcion_escenario VARCHAR NULL,
                                  tipo_escenario VARCHAR NULL,
                                  uuid_escenario UUID NOT NULL,
                                  CONSTRAINT escenario_pk PRIMARY KEY (id_escenario),
                                  CONSTRAINT escenario_unique UNIQUE (uuid_escenario)
);

-- Secuencia para id_proyecto en la tabla proyecto
CREATE SEQUENCE public.proyecto_id_proyecto_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
    CACHE 1
    NO CYCLE;

-- Tabla proyecto
CREATE TABLE public.proyecto (
                                 id_proyecto INT NOT NULL DEFAULT nextval('public.proyecto_id_proyecto_seq'),
                                 nombreproyecto VARCHAR NOT NULL,
                                 lider_proyecto VARCHAR NULL,
                                 uuid_proyecto UUID NOT NULL,
                                 id_cliente INT NULL,
                                 CONSTRAINT proyecto_pk PRIMARY KEY (id_proyecto),
                                 CONSTRAINT proyecto_unique UNIQUE (uuid_proyecto),
                                 CONSTRAINT proyecto_cliente_fk FOREIGN KEY (id_cliente) REFERENCES public.cliente(id_cliente)
);

-- Secuencia para id en la tabla asignacion
CREATE SEQUENCE public.asignacion_id_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 2147483647
    START 1
    CACHE 1
    NO CYCLE;

-- Tabla asignacion
CREATE TABLE public.asignacion (
                                   id INT NOT NULL DEFAULT nextval('public.asignacion_id_seq'),
                                   nombre_sitio VARCHAR NOT NULL,
                                   id_enlace VARCHAR NOT NULL,
                                   nombre_proyecto VARCHAR NOT NULL,
                                   nombre_escenario VARCHAR NULL,
                                   fecha_inicio DATE NOT NULL,
                                   fecha_asignacion DATE NULL,
                                   coordinador VARCHAR NULL,
                                   lider VARCHAR NULL,
                                   numero_miembros INT NOT NULL,
                                   nombre_estado VARCHAR NULL,
                                   estatus BOOLEAN NULL,
                                   uuid_asignaciones UUID NOT NULL,
                                   id_proyecto INT NULL,
                                   id_escenario INT NULL,
                                   id_estado INT NULL,
                                   CONSTRAINT asignaciones_pk PRIMARY KEY (id),
                                   CONSTRAINT asignaciones_unique UNIQUE (id_enlace),
                                   CONSTRAINT asignaciones_unique_1 UNIQUE (uuid_asignaciones),
                                   CONSTRAINT asignaciones_entidadfederativa_fk FOREIGN KEY (id_estado) REFERENCES public.entidad_federativa(id_entidad),
                                   CONSTRAINT asignaciones_escenario_fk FOREIGN KEY (id_escenario) REFERENCES public.escenario(id_escenario),
                                   CONSTRAINT asignaciones_proyecto_fk FOREIGN KEY (id_proyecto) REFERENCES public.proyecto(id_proyecto)
);

-- Permissions
ALTER TABLE public.cliente OWNER TO postgres;
ALTER TABLE public.entidad_federativa OWNER TO postgres;
ALTER TABLE public.escenario OWNER TO postgres;
ALTER TABLE public.proyecto OWNER TO postgres;
ALTER TABLE public.asignacion OWNER TO postgres;

-- Permissions
GRANT ALL ON SCHEMA public TO pg_database_owner;
GRANT USAGE ON SCHEMA public TO public;
