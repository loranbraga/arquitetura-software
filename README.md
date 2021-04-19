# Relatório

Relatório antes da refatoração

```
❯ cloc main
       4 text files.
       4 unique files.                              
       0 files ignored.

-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             4             32              6            180
-------------------------------------------------------------------------------
SUM:                             4             32              6            180
-------------------------------------------------------------------------------
```

Apos a refatorção

```
❯ cloc main
       5 text files.
       5 unique files.                              
       0 files ignored.

-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             5             33              4            177
-------------------------------------------------------------------------------
SUM:                             5             33              4            177
-------------------------------------------------------------------------------
```

Apesar de não ter impactado consideravelmente na quantidade linha, o projeto ficou mais legível pois houve uma troca de int para ENUM na textura do solo, commit [ENUMS](https://github.com/loranbraga/arquitetura-software/commit/9a2e3cdace4eb9731d17777b118abd816b698ba8) e o uso de arrays para substituir uma estrutura condicional de escolha para fontes de potássio e fosforo, commit [Arrays](https://github.com/loranbraga/arquitetura-software/commit/a93f5d428e91d1e510bdfd1672da39a4bd426648).
