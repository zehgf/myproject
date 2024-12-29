import request from '@/utils/request'

// 查询员工信息列表
export function listUser(query) {
  return request({
    url: '/staff/user/list',
    method: 'get',
    params: query
  })
}

// 查询员工信息详细
export function getUser(id) {
  return request({
    url: '/staff/user/' + id,
    method: 'get'
  })
}

// 新增员工信息
export function addUser(data) {
  return request({
    url: '/staff/user',
    method: 'post',
    data: data
  })
}

// 修改员工信息
export function updateUser(data) {
  return request({
    url: '/staff/user',
    method: 'put',
    data: data
  })
}

// 删除员工信息
export function delUser(id) {
  return request({
    url: '/staff/user/' + id,
    method: 'delete'
  })
}
