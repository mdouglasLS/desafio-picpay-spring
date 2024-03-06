CREATE TABLE transactions (
    id UUID NOT NULL,
    payer_id UUID NOT NULL,
    payee_id UUID NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    created_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMPTZ NOT NULL DEFAULT NOW(),
    FOREIGN KEY (payer_id) REFERENCES wallets(id) ON DELETE CASCADE,
    FOREIGN KEY (payee_id) REFERENCES wallets(id) ON DELETE CASCADE,
    CONSTRAINT pk_transactions PRIMARY KEY (id)
);