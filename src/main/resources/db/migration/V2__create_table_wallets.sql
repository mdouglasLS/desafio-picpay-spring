create table if not exists wallets (
    id UUID NOT NULL,
    user_id UUID,
    amount decimal not null,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE,
    CONSTRAINT pk_wallets PRIMARY KEY (id)
);