/* eslint-disable global-require */
/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 *
 * @format
 * @flow
 */

import React from 'react';
import {
  StyleSheet, SafeAreaView,
} from 'react-native';
import Prixa from 'react-native-prixa';

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#F5FCFF',
  },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#333333',
    marginBottom: 5,
  },
});

const App = () => (
  <SafeAreaView style={styles.container}>
    <Prixa
      devMode
      onClose={() => {
      }}
      intent={null}
      introSlides={[]}
      onDestinationChange={(destination) => {
        // eslint-disable-next-line no-console
        console.log(destination);
      }}
      showIntro
      themeColors={{}}
      token="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJiOTJhNjEyMC01MDBkLTExZTktODQwYy02ZDFiMDdiZGI1YjgiLCJzdWIiOiJiOTRhOWYwMC01MDBkLTExZTktYWNjMi01ZjZiMmU3MDRkNGMifQ.E0BSMnAyrM8eLqxlcfwH9Tde6vCLPkSmXJBFS3q2ymg"
    />
  </SafeAreaView>
);
export default App;
