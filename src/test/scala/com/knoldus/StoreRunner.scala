package com.knoldus

import io.cucumber.junit.{Cucumber, CucumberOptions}

import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  features = Array("src/test/resources")
)
class StoreRunner {}
