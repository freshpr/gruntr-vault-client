package org.gruntr.sops.client.vault;

import org.junit.jupiter.api.Test;

import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;

class VaultRestClientTest {
    @Test
    void test_ShouldNotFailOnCall() {
        var client = VaultRestClient.builder().build();
        assertDoesNotThrow(() -> client.decrypt("vault:v1:BG0m4DWGwiGq7/G4FqGiTVrTYOz6qMtAXJ9a7ZZS/18i0/GjJIosu7bhJeTYky8ExbZPBTxgNuyas7Kv"));

        var result = client.decrypt("vault:v1:BG0m4DWGwiGq7/G4FqGiTVrTYOz6qMtAXJ9a7ZZS/18i0/GjJIosu7bhJeTYky8ExbZPBTxgNuyas7Kv");

        assertArrayEquals(Base64.getDecoder().decode("HRuB7Y1/9jpbk1lR2m579U571Z97GuDXrerbGA3c+Ao="), result);
    }
}