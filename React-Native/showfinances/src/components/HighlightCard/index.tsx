import React from "react";
import { Container, Header, Content, Amount, LastTransaction, Title, UpIcon } from "./styles";

function HighlightCard() {
  return (
    <Container>
      <Header>
        <Title></Title>
        <UpIcon name="arrow-up-circle"/>
      </Header>
      <Content>
        <Amount>R$ 17.400,00</Amount>
        <LastTransaction>Ultima entrada dia 13 de abril</LastTransaction>
      </Content>
    </Container>
  )
}

export { HighlightCard };