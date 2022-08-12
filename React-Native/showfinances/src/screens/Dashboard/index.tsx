import React from "react";
import { SafeAreaView } from "react-native";

import { Container, Header, UserContainer, UserInfo, Photo, User, UserGreeting, UserName, PowerIcon } from './styled';
import { HighlightCard } from "../../components/HighlightCard";

function Dashboard() {
  return (
    <Container>
      <SafeAreaView>
        <Header>
          <UserContainer>
            <UserInfo>
              <Photo source={{ uri: 'https://avatars.githubusercontent.com/u/81587964?v=4'}} />
                <User>
                  <UserName>
                    André,
                  </UserName>
                  <UserGreeting>
                    Bem vindo de volta!
                  </UserGreeting>
                </User>
            </UserInfo>
            <PowerIcon name="power"/>
          </UserContainer>
        </Header>
        <HighlightCard></HighlightCard>
      </SafeAreaView>
    </Container>
  )
}

export { Dashboard };