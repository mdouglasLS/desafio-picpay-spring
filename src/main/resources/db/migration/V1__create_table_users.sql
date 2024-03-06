create table if not exists users (
    id UUID NOT NULL,
    name VARCHAR(266) not null unique,
    document VARCHAR(266) not null unique,
    user_type VARCHAR(266) default 'common',
    email VARCHAR(266) not null unique,
    password VARCHAR(266) not null,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    CONSTRAINT pk_users PRIMARY KEY (id)
);