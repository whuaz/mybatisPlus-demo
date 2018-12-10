-- DROP TABLE public.t_user

CREATE TABLE public.t_user (
	id varchar(32) NOT NULL,
	username varchar(255) NOT NULL,
	"password" varchar(255) NOT NULL,
	enabled bool NOT NULL DEFAULT true,
	lastpasswordresetdate timestamp NOT NULL,
	CONSTRAINT t_user_pk PRIMARY KEY (id)
)