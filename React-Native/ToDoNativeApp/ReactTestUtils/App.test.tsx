import React from "react";
import App from "../src/App";
import renderer from "react-test-renderer";

describe("App", () => {
  it('should be rendered hello world correctly', () => {
    const app = renderer.create(<App />);
    expect(app).toMatchSnapshot('hello world');
  });
});