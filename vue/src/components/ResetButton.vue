<template>
    <button @click="resetProperties" class="resetAll">Reset</button>
</template>

<script>
export default {
  data() {
    return {
      property1: "Hello",
      property2: "World"
    };
  },
  methods: {
    resetProperties() {
      this.property1 = "";
      this.property2 = "";
      console.log("hello")
    }
  }
};
</script>

<style scoped>

</style>