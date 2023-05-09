<template>
  <div class="page-wrapper">
    <div class="title-container">
      <h4>Welcome To</h4>
      <h1>Do-Re-Mi-Fa-So-La-Ti-Do</h1>
    </div>
    <div class="button-container">
      <SelectedButtons />
    </div>
    <div class="piano-container">
      <Piano />
    </div>
    <div class="response-container">
      <ResponseComponent />
    </div>
    <div class="reset-container">
      <ResetButton />
    </div>
  </div>
</template>

<script setup>

import Piano from "../components/Piano.vue"
import ResetButton from "../components/ResetButton.vue"
import SelectedButtons from "../components/SelectedButtons.vue"
import ResponseComponent from "../components/ResponseComponent.vue"

</script>

<style>
div {
  border: 1px solid black;
}

.page-wrapper {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.title-container > h4, h1 {
  height: auto;
  width: 100%;
}

h4, h1 {
  text-align: center;
}

.button-container {
  width: auto;
  height: auto;
  display: flex;
}

.piano-container {
  height: auto;
  width: auto;
  display: flex;
  justify-content: center;
}

.response-container {
  width: 100%;
  height: auto;
}

.reset-container {
  width: 100%;
  height: 5vh;
  display: flex;
  justify-content: center;
}

</style>
