# Trabalho final - Padrões e princípios de projeto

Nomes: Juliana Rodrigues Gonçalves e Luís Henrique Gonçalves de Oliveira

## 1 - Objetivo

O projeto consiste no desenvolvimento de um framework para aplicações de quiz. A arquitetura do projeto foi dividida de uma forma que garante que o framework seja Open-closed:

- quiz.framework
- quiz.aplicacao

O framework permite que os desenvolvedores criem facilmente diferentes tipos de quiz sem mexer em nada do que está dentro de quiz.framework.

## 2 - Padrões de projeto

O framework atende a obrigatoriedade em utilizar os 3 padrões de projeto a seguir:

- Template - implementado na classe ```QuizTemplate```.
- Strategy - representado pela interface ```StrategyPontuacao```.
- Factory - representado pela interface ```QuizFactory```.

## 3 - Desacoplamento

O framework não depende diretamente de classes Swing ou web, e permite a construção de aplicações com interface gráfica ou não, atendendo os requisitos do trabalho, ou seja, tanto a aplicação 1 quanto a aplicação 2 utilizam do mesmo framework (o pacote ```quiz.framework```).

## 4 - Funcionalidade

Na aplicação 1 (quiz.aplicacao.programacao) o quiz consiste em 10 pontos para respostas certas e -5 pontos por cada erro.

Já na aplicação 2 (quiz.aplicacao.console) o quiz sobre K-Pop tem 15 pontos por acerto e -5 por erros.
