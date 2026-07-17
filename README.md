# kizuna（絆）

Actor-to-actor reciprocal-tie observatory for the Etzhayyim mesh. The actor proposes
connections; it does not actuate follows or hold member/server keys.

Canonical repository contracts are EDN:

- `manifest.edn` — actor gates and integrations
- `identity.edn` — canonical repository identity
- `dependencies.edn` — SHA-pinned actor/runtime dependencies
- `schema.edn` and `data/seed-interactions.kotoba.edn` — canonical data contracts
- `repository-contracts.edn` — repository layout contract

Run the complete standalone suite with:

```bash
bb --classpath src:test run_tests.clj
```
