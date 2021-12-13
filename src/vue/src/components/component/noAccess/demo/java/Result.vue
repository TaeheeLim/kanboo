<template>
  <div class="result-container">
    <div class="title">Result</div>
    <pre style="color: #fff;">{{$store.state.demo.resultCode}}</pre>
  </div>
</template>

<script>
export default {
  name: "Result"
}
</script>

<style scoped>
.result-container {
  padding: 10px;
}

.title {
  font-size: 20px;
  margin-bottom: 10px;
}


</style>