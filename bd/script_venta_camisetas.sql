-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler  version: 0.9.2-beta1
-- PostgreSQL version: 11.0
-- Project Site: pgmodeler.io
-- Model Author: ---


-- Database creation must be done outside a multicommand file.
-- These commands were put in this file only as a convenience.
-- -- object: new_database | type: DATABASE --
-- -- DROP DATABASE IF EXISTS new_database;
-- CREATE DATABASE new_database;
-- -- ddl-end --
-- 

-- object: public.estampado | type: TABLE --
-- DROP TABLE IF EXISTS public.estampado CASCADE;
CREATE TABLE public.estampado (
	nombre varchar(255) NOT NULL,
	id serial NOT NULL,
	descripcion text,
	fecha_registro date NOT NULL,
	disponible_venta boolean NOT NULL DEFAULT true,
	id_tema integer NOT NULL,
	id_usuario integer NOT NULL,
	CONSTRAINT pk_estampado PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.estampado IS 'estampados';
-- ddl-end --
COMMENT ON COLUMN public.estampado.id IS 'id de la tabla';
-- ddl-end --
COMMENT ON COLUMN public.estampado.descripcion IS 'descripcion';
-- ddl-end --
COMMENT ON COLUMN public.estampado.fecha_registro IS 'fecha del registro de la estampa';
-- ddl-end --
ALTER TABLE public.estampado OWNER TO postgres;
-- ddl-end --

-- object: public.imagen_estampa | type: TABLE --
-- DROP TABLE IF EXISTS public.imagen_estampa CASCADE;
CREATE TABLE public.imagen_estampa (
	id serial NOT NULL,
	ruta_gardada text NOT NULL,
	fk_estampado integer NOT NULL,
	CONSTRAINT pk PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.imagen_estampa IS 'imagen de un estampado';
-- ddl-end --
COMMENT ON COLUMN public.imagen_estampa.ruta_gardada IS 'Ruta donde esta guardada el estampado';
-- ddl-end --
COMMENT ON COLUMN public.imagen_estampa.fk_estampado IS 'Llave foranea para unir el estampado';
-- ddl-end --
COMMENT ON CONSTRAINT pk ON public.imagen_estampa  IS 'llane primaria de la tabla';
-- ddl-end --
ALTER TABLE public.imagen_estampa OWNER TO postgres;
-- ddl-end --

-- object: public.camiseta | type: TABLE --
-- DROP TABLE IF EXISTS public.camiseta CASCADE;
CREATE TABLE public.camiseta (
	id serial NOT NULL,
	fecha_registro date,
	nombre varchar(255) NOT NULL,
	descripcion text,
	fk_talla integer NOT NULL,
	fk_estampado integer,
	habilitada bool NOT NULL DEFAULT true,
	CONSTRAINT pk_camiseta PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON COLUMN public.camiseta.fecha_registro IS 'fecha de registro de la camiseta';
-- ddl-end --
COMMENT ON COLUMN public.camiseta.nombre IS 'nombre del producto';
-- ddl-end --
COMMENT ON COLUMN public.camiseta.descripcion IS 'Descripcion de la camiseta';
-- ddl-end --
COMMENT ON COLUMN public.camiseta.fk_talla IS 'Talla de la camiseta, es una fk a la tabla talla';
-- ddl-end --
COMMENT ON COLUMN public.camiseta.habilitada IS 'Si la camiseta esta o no habilitada';
-- ddl-end --
COMMENT ON CONSTRAINT pk_camiseta ON public.camiseta  IS 'Llave primaria de la camiseta';
-- ddl-end --
ALTER TABLE public.camiseta OWNER TO postgres;
-- ddl-end --

-- object: public.inventario_camisetas | type: TABLE --
-- DROP TABLE IF EXISTS public.inventario_camisetas CASCADE;
CREATE TABLE public.inventario_camisetas (
	id serial NOT NULL,
	fecha_registro date NOT NULL,
	fk_camiseta integer NOT NULL,
	fk_estado integer NOT NULL,
	CONSTRAINT inventario_camisetas_pk PRIMARY KEY (id,fk_camiseta,fk_estado)

);
-- ddl-end --
COMMENT ON COLUMN public.inventario_camisetas.id IS 'llave primaria de la tabla';
-- ddl-end --
COMMENT ON COLUMN public.inventario_camisetas.fecha_registro IS 'fecha en que se hizo un nuevo registro de camisetas';
-- ddl-end --
ALTER TABLE public.inventario_camisetas OWNER TO postgres;
-- ddl-end --

-- object: public.talla | type: TABLE --
-- DROP TABLE IF EXISTS public.talla CASCADE;
CREATE TABLE public.talla (
	id serial NOT NULL,
	fecha_registro date NOT NULL DEFAULT now,
	nombre varchar(20) NOT NULL,
	representacion_numerica smallint NOT NULL,
	habilitado bool NOT NULL DEFAULT true,
	CONSTRAINT pk_talla PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON COLUMN public.talla.id IS 'id de la tabla
';
-- ddl-end --
COMMENT ON COLUMN public.talla.fecha_registro IS 'fecha en que se registro la nueva talla';
-- ddl-end --
COMMENT ON COLUMN public.talla.nombre IS 'nombre de la talla';
-- ddl-end --
COMMENT ON COLUMN public.talla.representacion_numerica IS 'Representacion numerica del nombre de la talla';
-- ddl-end --
COMMENT ON COLUMN public.talla.habilitado IS 'muestra si esta habilitado o no';
-- ddl-end --
ALTER TABLE public.talla OWNER TO postgres;
-- ddl-end --

-- object: public.venta_camiseta | type: TABLE --
-- DROP TABLE IF EXISTS public.venta_camiseta CASCADE;
CREATE TABLE public.venta_camiseta (
	id serial NOT NULL,
	fecha_venta timestamp NOT NULL,
	fecha_registro timestamp NOT NULL,
	fk_vendedor integer NOT NULL,
	fk_cliente integer NOT NULL,
	fk_camiseta integer NOT NULL,
	fk_forma_pago integer NOT NULL,
	CONSTRAINT pk_venta PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON COLUMN public.venta_camiseta.fecha_venta IS 'fecha en que se realizo la venta';
-- ddl-end --
COMMENT ON COLUMN public.venta_camiseta.fecha_registro IS 'fecha en que se hizo el registro de la venta';
-- ddl-end --
COMMENT ON COLUMN public.venta_camiseta.fk_vendedor IS 'llave foranea a la tabla vendedor';
-- ddl-end --
COMMENT ON COLUMN public.venta_camiseta.fk_cliente IS 'Llave foranea al cliente';
-- ddl-end --
ALTER TABLE public.venta_camiseta OWNER TO postgres;
-- ddl-end --

-- object: public.persona | type: TABLE --
-- DROP TABLE IF EXISTS public.persona CASCADE;
CREATE TABLE public.persona (
	id serial NOT NULL,
	nombre_completo varchar(255) NOT NULL,
	apellido_completo varchar(255) NOT NULL,
	fecha_nacimiento date,
	email varchar(255),
	fecha_registro timestamp NOT NULL DEFAULT now,
	CONSTRAINT pk_id PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE public.persona OWNER TO postgres;
-- ddl-end --

-- object: public.usuario | type: TABLE --
-- DROP TABLE IF EXISTS public.usuario CASCADE;
CREATE TABLE public.usuario (
	id serial NOT NULL,
	fecha_registro smallint NOT NULL DEFAULT now,
	nombre varchar(255) NOT NULL,
	descripcion text NOT NULL,
	fk_persona integer NOT NULL,
	fk_rol integer NOT NULL,
	CONSTRAINT pk_usuario PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE public.usuario OWNER TO postgres;
-- ddl-end --

-- object: public.rol | type: TABLE --
-- DROP TABLE IF EXISTS public.rol CASCADE;
CREATE TABLE public.rol (
	id serial NOT NULL,
	nombre varchar(255) NOT NULL,
	fecha_registro timestamp NOT NULL,
	descripcion text NOT NULL,
	CONSTRAINT pk_rol PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON COLUMN public.rol.descripcion IS 'descripcion del rol';
-- ddl-end --
ALTER TABLE public.rol OWNER TO postgres;
-- ddl-end --

-- object: public.estado_inventario | type: TABLE --
-- DROP TABLE IF EXISTS public.estado_inventario CASCADE;
CREATE TABLE public.estado_inventario (
	id integer NOT NULL,
	nombre varchar(255) NOT NULL,
	CONSTRAINT pk_estado_inventario PRIMARY KEY (id,nombre)

);
-- ddl-end --
COMMENT ON COLUMN public.estado_inventario.nombre IS 'nombre de estado';
-- ddl-end --
ALTER TABLE public.estado_inventario OWNER TO postgres;
-- ddl-end --

-- object: public.forma_pago | type: TABLE --
-- DROP TABLE IF EXISTS public.forma_pago CASCADE;
CREATE TABLE public.forma_pago (
	id serial NOT NULL,
	nombre varchar(255) NOT NULL,
	impuesto smallint NOT NULL DEFAULT 0,
	descripcion text,
	CONSTRAINT pk_forma_pago PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON COLUMN public.forma_pago.impuesto IS 'Si la forma de pago tiene un % de impuesto, este se agregara aqui. es un valor numerico';
-- ddl-end --
COMMENT ON COLUMN public.forma_pago.descripcion IS 'descripcion de la forma de pago';
-- ddl-end --
ALTER TABLE public.forma_pago OWNER TO postgres;
-- ddl-end --

-- object: public.movimiento_inventario | type: TABLE --
-- DROP TABLE IF EXISTS public.movimiento_inventario CASCADE;
CREATE TABLE public.movimiento_inventario (
	id smallint NOT NULL,
	fk_movimiento_predecesor integer NOT NULL,
	fk_movimiento_sucesor integer NOT NULL,
	CONSTRAINT pk_movimiento_inventario PRIMARY KEY (id,fk_movimiento_predecesor,fk_movimiento_sucesor)

);
-- ddl-end --
COMMENT ON COLUMN public.movimiento_inventario.fk_movimiento_predecesor IS 'se refiere registro que precede al nuevo movimiento';
-- ddl-end --
COMMENT ON COLUMN public.movimiento_inventario.fk_movimiento_sucesor IS 'es el nuevo registro en el inventario, luego de que se haga el movimiento';
-- ddl-end --
ALTER TABLE public.movimiento_inventario OWNER TO postgres;
-- ddl-end --

-- object: public.tema_estampado | type: TABLE --
-- DROP TABLE IF EXISTS public.tema_estampado CASCADE;
CREATE TABLE public.tema_estampado (
	id serial NOT NULL,
	nombre varchar(255) NOT NULL,
	CONSTRAINT pk_tema_estampado PRIMARY KEY (id)

);
-- ddl-end --
ALTER TABLE public.tema_estampado OWNER TO postgres;
-- ddl-end --

-- object: public.estampado_raiting | type: TABLE --
-- DROP TABLE IF EXISTS public.estampado_raiting CASCADE;
CREATE TABLE public.estampado_raiting (
	id serial NOT NULL,
	voto smallint NOT NULL,
	id_estampado integer NOT NULL,
	CONSTRAINT pk_raiting_estampado PRIMARY KEY (id)

);
-- ddl-end --
COMMENT ON TABLE public.estampado_raiting IS 'Tabla para poder llevar los votos de los estampados';
-- ddl-end --
COMMENT ON COLUMN public.estampado_raiting.voto IS 'El valor del voto es 0 a 5';
-- ddl-end --
ALTER TABLE public.estampado_raiting OWNER TO postgres;
-- ddl-end --

-- object: fk_tema_estampado | type: CONSTRAINT --
-- ALTER TABLE public.estampado DROP CONSTRAINT IF EXISTS fk_tema_estampado CASCADE;
ALTER TABLE public.estampado ADD CONSTRAINT fk_tema_estampado FOREIGN KEY (id_tema)
REFERENCES public.tema_estampado (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_autor | type: CONSTRAINT --
-- ALTER TABLE public.estampado DROP CONSTRAINT IF EXISTS fk_autor CASCADE;
ALTER TABLE public.estampado ADD CONSTRAINT fk_autor FOREIGN KEY (id_usuario)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: "fk estampado" | type: CONSTRAINT --
-- ALTER TABLE public.imagen_estampa DROP CONSTRAINT IF EXISTS "fk estampado" CASCADE;
ALTER TABLE public.imagen_estampa ADD CONSTRAINT "fk estampado" FOREIGN KEY (fk_estampado)
REFERENCES public.estampado (id) MATCH FULL
ON DELETE CASCADE ON UPDATE CASCADE;
-- ddl-end --
COMMENT ON CONSTRAINT "fk estampado" ON public.imagen_estampa  IS 'llave foranea uno a muchos desde imagen estampado a estampado';
-- ddl-end --


-- object: fk_talla | type: CONSTRAINT --
-- ALTER TABLE public.camiseta DROP CONSTRAINT IF EXISTS fk_talla CASCADE;
ALTER TABLE public.camiseta ADD CONSTRAINT fk_talla FOREIGN KEY (fk_talla)
REFERENCES public.talla (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --
COMMENT ON CONSTRAINT fk_talla ON public.camiseta  IS 'fk de la talla';
-- ddl-end --


-- object: fk_estampa | type: CONSTRAINT --
-- ALTER TABLE public.camiseta DROP CONSTRAINT IF EXISTS fk_estampa CASCADE;
ALTER TABLE public.camiseta ADD CONSTRAINT fk_estampa FOREIGN KEY (fk_estampado)
REFERENCES public.estampado (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_estado | type: CONSTRAINT --
-- ALTER TABLE public.inventario_camisetas DROP CONSTRAINT IF EXISTS fk_estado CASCADE;
ALTER TABLE public.inventario_camisetas ADD CONSTRAINT fk_estado FOREIGN KEY (fk_estado)
REFERENCES public.estado_inventario (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_camiseta | type: CONSTRAINT --
-- ALTER TABLE public.inventario_camisetas DROP CONSTRAINT IF EXISTS fk_camiseta CASCADE;
ALTER TABLE public.inventario_camisetas ADD CONSTRAINT fk_camiseta FOREIGN KEY (fk_camiseta)
REFERENCES public.camiseta (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_camiseta | type: CONSTRAINT --
-- ALTER TABLE public.venta_camiseta DROP CONSTRAINT IF EXISTS fk_camiseta CASCADE;
ALTER TABLE public.venta_camiseta ADD CONSTRAINT fk_camiseta FOREIGN KEY (fk_camiseta)
REFERENCES public.camiseta (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --
COMMENT ON CONSTRAINT fk_camiseta ON public.venta_camiseta  IS 'llave foranea a la tabla camiseta';
-- ddl-end --


-- object: fk_vendedor | type: CONSTRAINT --
-- ALTER TABLE public.venta_camiseta DROP CONSTRAINT IF EXISTS fk_vendedor CASCADE;
ALTER TABLE public.venta_camiseta ADD CONSTRAINT fk_vendedor FOREIGN KEY (fk_vendedor)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_cliente | type: CONSTRAINT --
-- ALTER TABLE public.venta_camiseta DROP CONSTRAINT IF EXISTS fk_cliente CASCADE;
ALTER TABLE public.venta_camiseta ADD CONSTRAINT fk_cliente FOREIGN KEY (fk_cliente)
REFERENCES public.usuario (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_forma_pago | type: CONSTRAINT --
-- ALTER TABLE public.venta_camiseta DROP CONSTRAINT IF EXISTS fk_forma_pago CASCADE;
ALTER TABLE public.venta_camiseta ADD CONSTRAINT fk_forma_pago FOREIGN KEY (fk_forma_pago)
REFERENCES public.forma_pago (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_persona | type: CONSTRAINT --
-- ALTER TABLE public.usuario DROP CONSTRAINT IF EXISTS fk_persona CASCADE;
ALTER TABLE public.usuario ADD CONSTRAINT fk_persona FOREIGN KEY (fk_persona)
REFERENCES public.persona (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_rol | type: CONSTRAINT --
-- ALTER TABLE public.usuario DROP CONSTRAINT IF EXISTS fk_rol CASCADE;
ALTER TABLE public.usuario ADD CONSTRAINT fk_rol FOREIGN KEY (fk_rol)
REFERENCES public.rol (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_movimiento_predecesor | type: CONSTRAINT --
-- ALTER TABLE public.movimiento_inventario DROP CONSTRAINT IF EXISTS fk_movimiento_predecesor CASCADE;
ALTER TABLE public.movimiento_inventario ADD CONSTRAINT fk_movimiento_predecesor FOREIGN KEY (fk_movimiento_predecesor)
REFERENCES public.inventario_camisetas (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_movimiento_sucesor | type: CONSTRAINT --
-- ALTER TABLE public.movimiento_inventario DROP CONSTRAINT IF EXISTS fk_movimiento_sucesor CASCADE;
ALTER TABLE public.movimiento_inventario ADD CONSTRAINT fk_movimiento_sucesor FOREIGN KEY (fk_movimiento_sucesor)
REFERENCES public.inventario_camisetas (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --

-- object: fk_estampado | type: CONSTRAINT --
-- ALTER TABLE public.estampado_raiting DROP CONSTRAINT IF EXISTS fk_estampado CASCADE;
ALTER TABLE public.estampado_raiting ADD CONSTRAINT fk_estampado FOREIGN KEY (id_estampado)
REFERENCES public.estampado (id) MATCH FULL
ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --


